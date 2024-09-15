class Solution {
    public int findMin(int[] nums) {
        // int min = nums[0];
        // for(int i=0;i<nums.length;i++){
        //     min = Math.min(nums[i],min);
        // }
        // return min;
        int l=0,r=nums.length-1;
        while(l<r){
            int mid = l+(r-l)/2;
            if(nums[mid]>nums[r]){
                l = mid+1;
            }else{
                r = mid;
            }
        }
        return nums[l];
    }
}