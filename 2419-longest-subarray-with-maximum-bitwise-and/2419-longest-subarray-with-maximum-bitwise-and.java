class Solution {
    public int longestSubarray(int[] nums) {
        int maxLen = 0,maxEle =0,currLen =0;
        for(int num:nums){
            if(maxEle<num) maxEle = num;
        }
        for(int num:nums){
            if(maxEle == num){
                currLen++;
                maxLen = Math.max(currLen,maxLen);
            }else{
                currLen = 0;
            }
        }
        return maxLen;
    }
}
