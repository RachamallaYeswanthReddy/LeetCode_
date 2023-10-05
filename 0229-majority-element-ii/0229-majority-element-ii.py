class Solution:
    def majorityElement(self, nums: List[int]) -> List[int]:
        elements = []
        for i in set(nums):
            if nums.count(i) > len(nums)//3:
                elements.append(i)
        return elements
