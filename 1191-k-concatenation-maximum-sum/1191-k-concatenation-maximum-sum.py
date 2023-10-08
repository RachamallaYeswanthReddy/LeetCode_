class Solution:
    def kConcatenationMaxSum(self, arr: List[int], k: int) -> int:
        mod = 10**9+7
        n = len(arr)
        if n<1:
            return 0
        def maxsubarray(arr):
            maxi= 0
            current_sum = 0
            for i in arr:
                current_sum = max(i,current_sum+i)
                maxi = max(maxi,current_sum)
            return maxi
        maximum = maxsubarray(arr)
        
        arr_sum = sum(arr)
        
        if k==1:
            return maximum%mod
        max_double = maxsubarray(arr*2)
        max_conc = max_double
        if arr_sum>0:
            max_conc+=max(0,(k-2)*arr_sum)
        return max(maximum,max_conc)%mod