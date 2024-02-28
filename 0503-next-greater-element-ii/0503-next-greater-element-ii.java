import java.util.Stack;

class Solution {
    public int[] nextGreaterElements(int[] nums) {
        int n = nums.length;
        int[] greatest = new int[n];
        Stack<Integer> stack = new Stack<>();

        // Initialize greatest array with -1
        for (int i = 0; i < n; i++) {
            greatest[i] = -1;
        }

        for (int i = 0; i < 2 * n; i++) {
            int num = nums[i % n];
            while (!stack.isEmpty() && nums[stack.peek()] < num) {
                greatest[stack.pop()] = num;
            }
            if (i < n) {
                stack.push(i);
            }
        }
        return greatest;
    }
}
