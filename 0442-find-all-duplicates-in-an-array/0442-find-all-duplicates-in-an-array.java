class Solution {
    public List<Integer> findDuplicates(int[] nums) {
        List<Integer> res = new ArrayList<>();
        Arrays.sort(nums);
        int n= nums.length;
        for(int i=0;i<n-1;i++){
            if(nums[i] == nums[i+1]){
                res.add(nums[i+1]);
            }
        }
        return res;
    }
}