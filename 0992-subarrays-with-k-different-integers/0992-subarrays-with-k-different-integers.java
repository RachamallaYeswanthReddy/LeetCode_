class Solution {
    public int subarraysWithKDistinct(int[] nums, int k) {
        int res = wrapper(nums,k)-wrapper(nums,k-1);
        return res;
    }
    public int wrapper(int[] nums, int k){
        int l=0,r=0,count=0;
        HashMap<Integer,Integer>mpp= new HashMap<>();
        while(r<nums.length){
            mpp.put(nums[r],mpp.getOrDefault(nums[r],0)+1);
            while(mpp.size()>k){
                mpp.put(nums[l],mpp.getOrDefault(nums[l],0)-1);
                if(mpp.get(nums[l])==0){
                    mpp.remove(nums[l]);
                }
                l++;
            }
            count+=r-l+1;
            r++;
        }
        return count;
    }
}