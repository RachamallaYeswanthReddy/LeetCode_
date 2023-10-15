class Solution:
    def numWays(self, steps: int, arrLen: int) -> int:
        mod = 10**9+7
        
        maxi = min(arrLen - 1, steps // 2)
    
        dp = [[0] * (maxi + 1) for _ in range(steps + 1)]
        dp[0][0] = 1

        for i in range(1, steps + 1):
            for j in range(maxi + 1):
                dp[i][j] = dp[i - 1][j]
                if j > 0:
                    dp[i][j] = (dp[i][j] + dp[i - 1][j - 1]) % mod
                if j < maxi:
                    dp[i][j] = (dp[i][j] + dp[i - 1][j + 1]) % mod

        return dp[steps][0]
