class Solution {
    public int minSteps(int n) {
        // No operations required to perform the operation 
        if(n<=1) return 0;
        int[] dp = new int[n+1];
        for(int i=2;i<n+1;i++){
            dp[i] = i;
            for(int j=i/2;j>1;j--){
                if(i%j==0){
                    dp[i] = dp[j]+(i/j);
                    break;
                }
            }
        }
        return dp[n];
    }
}