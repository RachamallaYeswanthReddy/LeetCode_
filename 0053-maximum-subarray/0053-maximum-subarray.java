class Solution {
    public int maxSubArray(int[] nums) {
        int maxi = Integer.MIN_VALUE;
        int curr = 0;
        if(nums.length<=1){
            return nums[0];
        }
        for(int i=0;i<nums.length;i++){
            curr+=nums[i];
            if(maxi<curr){
                maxi = curr;
            }
            if(curr<0){
                curr= 0;
            }
        }
        return maxi;
    }
}