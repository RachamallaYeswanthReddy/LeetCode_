import java.util.PriorityQueue;

class Solution {
    public double maxAverageRatio(int[][] classes, int extraStudents) {
        // Priority queue to maximize the gain in pass ratio
        PriorityQueue<int[]> pq = new PriorityQueue<>((a, b) -> {
            double gainA = calculateGain(a[0], a[1]);
            double gainB = calculateGain(b[0], b[1]);
            return Double.compare(gainB, gainA); // Max-heap based on gain
        });

        // Add all classes to the priority queue
        for (int[] c : classes) {
            pq.offer(c);
        }

        // Distribute extra students
        while (extraStudents > 0) {
            int[] current = pq.poll();
            current[0]++; // Increment pass students
            current[1]++; // Increment total students
            pq.offer(current); // Re-add the updated class to the queue
            extraStudents--;
        }

        // Calculate the final average pass ratio
        double totalAverage = 0.0;
        while (!pq.isEmpty()) {
            int[] c = pq.poll();
            totalAverage += (double) c[0] / c[1];
        }

        return totalAverage / classes.length;
    }

    private double calculateGain(int pass, int total) {
        double currentRatio = (double) pass / total;
        double newRatio = (double) (pass + 1) / (total + 1);
        return newRatio - currentRatio;
    }
}
