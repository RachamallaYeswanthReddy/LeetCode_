class Solution:
    def maxProduct(self, nums: List[int]) -> int:
        num1 = max(nums)
        nums.remove(num1)
        num2 = max(nums)
        return (num1-1)*(num2-1)