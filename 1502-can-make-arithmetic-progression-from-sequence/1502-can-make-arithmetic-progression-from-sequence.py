class Solution:
    def canMakeArithmeticProgression(self, arr: List[int]) -> bool:
        arr.sort()
        diff = abs(arr[1]-arr[0])
        ap = True
        for i in range(len(arr)-1):
            if abs(arr[i]-arr[i+1]) != diff:
                ap = False
                break
        return ap