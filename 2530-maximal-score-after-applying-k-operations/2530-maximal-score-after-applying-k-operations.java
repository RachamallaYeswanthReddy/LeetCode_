class Solution {
    public long maxKelements(int[] nums, int k) {
        long score = 0;
        PriorityQueue<Integer>q = new PriorityQueue<>(Collections.reverseOrder());
        for(int i=0;i<nums.length;i++){
            q.add(nums[i]);
        }
        while(!q.isEmpty() && k>0){
            int maxElement = q.poll();
            score+= maxElement;
            q.add((int) Math.ceil(maxElement/3.0));
            k--;
        }
        return score;
    }
}