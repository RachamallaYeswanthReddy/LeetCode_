class Solution {
    public int countKDifference(int[] nums, int k) {
        if(nums.length<=1) return 0;
        int l = 0,r=0;
        int count = 0;
        while(r<nums.length){
            if(Math.abs(nums[r]-nums[l])==k){count++;}
            if(r==nums.length-1){
                l++;
                r=l;
            }
            r++;
        }
        return count;
    }
}