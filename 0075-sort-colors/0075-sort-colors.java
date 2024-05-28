class Solution {
    public void sortColors(int[] nums) {
        int OneCount = nums.length;
        int ZeroCount = 0;
        int TwoCount = 0;
        for(int i=0;i<nums.length;i++){
            if(nums[i] == 0){
                ZeroCount++;
                OneCount--;
            }
            if(nums[i]==2){
                TwoCount++;
                OneCount--;
            }
        }
        int j=0;
        while(ZeroCount>0){
            nums[j] = 0;
            j++;
            ZeroCount--;
        }
        while(OneCount>0){
            nums[j] = 1;
            j++;
            OneCount--;
        }
        while(TwoCount>0){
            nums[j] = 2;
            j++;
            TwoCount--;
        }
    }
}