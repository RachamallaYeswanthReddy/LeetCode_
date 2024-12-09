class Solution {
    public boolean[] isArraySpecial(int[] nums, int[][] queries) {
        int n = nums.length;
        boolean[] parityDiff = new boolean[n - 1];
        int[] prefixSpecial = new int[n]; // Prefix sum array
        
        for (int i = 0; i < n - 1; i++) {
            parityDiff[i] = (nums[i] % 2) != (nums[i + 1] % 2); // Check different parity
        }
        
        for (int i = 1; i < n; i++) {
            prefixSpecial[i] = prefixSpecial[i - 1] + (parityDiff[i - 1] ? 1 : 0);
        }
        
        boolean[] res = new boolean[queries.length];
        for (int i = 0; i < queries.length; i++) {
            int low = queries[i][0];
            int high = queries[i][1];
            
            res[i] = (prefixSpecial[high] - prefixSpecial[low]) == (high - low);
        }
        
        return res;
    }
}
