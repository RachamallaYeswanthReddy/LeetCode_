class Solution:
    def maxProductDifference(self, nums: List[int]) -> int:
        nums.sort()
        n = len(nums)

        product1 = nums[n - 1] * nums[n - 2] - nums[0] * nums[1]
        product2 = nums[n - 1] * nums[0] - nums[1] * nums[2]
        product3 = nums[n - 1] * nums[1] - nums[2] * nums[3]
        product4 = nums[n - 1] * nums[2] - nums[0] * nums[3]

        return max(product1, product2, product3, product4)
