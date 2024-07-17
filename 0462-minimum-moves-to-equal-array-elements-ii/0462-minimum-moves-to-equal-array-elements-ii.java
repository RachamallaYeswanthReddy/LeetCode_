class Solution {
    public int minMoves2(int[] nums) {
        if(nums.length == 1) return 0;
        int minMoves=0;
        // for(int i=0;i<nums.length;i++){
        //     int sum =0;
        //     for(int j=0;j<nums.length;j++){
        //         sum += Math.abs(nums[i]-nums[j]);
        //     }
        //     if(minMoves>sum){
        //         minMoves = sum;
        //     }
        // }
        int n=nums.length;
        Arrays.sort(nums);
        int median = nums[n/2];
        for(int num: nums){
            minMoves += Math.abs(num-median);
        }
        return minMoves;
    }
}

