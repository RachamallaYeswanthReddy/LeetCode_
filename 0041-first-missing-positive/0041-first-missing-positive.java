import java.util.Arrays;

class Solution {
    public int firstMissingPositive(int[] nums) {
        Arrays.sort(nums);
        int n = nums.length;
        int smallNum = 1;

        for (int i = 0; i < n; i++) {
            if (nums[i] == smallNum) {
                smallNum++;
            }
        }

        return smallNum;
    }
}
