class Solution {
    public int numberOfSubarrays(int[] nums, int k) {
        int res = count(nums,k)-count(nums,k-1);
        return res;
    }
    public int count(int[] nums, int k){
        if(k<0)return 0;
        int l =0,r=0,count=0,sumOdd=0;
        while(r<nums.length){
            sumOdd+=nums[r]%2;
            while(sumOdd>k){
                sumOdd-=nums[l]%2;
                l++;
            }
            count+=r-l+1;
            r++;
        }
        return count;
    }
}