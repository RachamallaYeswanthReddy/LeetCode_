class Solution {
    public boolean check(int[] nums) {
        int[] sorted = nums.clone();
        Arrays.sort(sorted);
        int n= nums.length;
        for(int i=0;i<nums.length;i++){
            boolean isMatch = true;
            for (int j = 0; j < n; j++) {
                if (nums[(i + j) % n] != sorted[j]) {
                    isMatch = false;
                    break;
                }
            }
       if (isMatch){
            return true;
        }
    }
        return false;
    }
}