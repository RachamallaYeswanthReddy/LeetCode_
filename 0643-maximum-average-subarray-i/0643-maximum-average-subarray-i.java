class Solution {
    public double findMaxAverage(int[] nums, int k) {
        if(nums.length==1 && k ==1){
            return (double)nums[0];
        }
        int n =0,sum=0;
        for(int i=0;i<k;i++){
            sum+=nums[i];
        }
        int maxSum = sum;
        for(int i=k;i<nums.length;i++){
            sum = sum - nums[i-k]+nums[i];
            maxSum = Math.max(maxSum,sum);
        }
        
        return (double)maxSum/k ;
    }
}