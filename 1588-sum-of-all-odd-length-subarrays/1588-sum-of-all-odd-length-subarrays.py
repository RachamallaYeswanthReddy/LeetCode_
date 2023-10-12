class Solution:
    def sumOddLengthSubarrays(self, arr: List[int]) -> int:
        sum_arr = 0
        for i in range(len(arr)):
            for j in range(i,len(arr),2):
                sum_arr+=sum(arr[i:j+1])
        return sum_arr