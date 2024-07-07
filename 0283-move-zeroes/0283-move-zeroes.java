class Solution {
    public void moveZeroes(int[] nums) {
        int n = nums.length;
        if(n == 1 || n==0) return;
        int pos = 0;
        for(int num:nums){
            if(num!=0){
                nums[pos++] = num;
            }
        }
        while(n>pos){
            nums[pos++] = 0;
        }
    }
}