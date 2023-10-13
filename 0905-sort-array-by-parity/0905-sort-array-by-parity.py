class Solution:
    def sortArrayByParity(self, nums: List[int]) -> List[int]:
        even = []
        odd = []
        if len(nums)<=1:return nums
        for i in nums:
            if i%2 == 0: even.append(i)
            else:
                odd.append(i)
        return even+odd