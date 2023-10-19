class Solution:
    def findKDistantIndices(self, nums: List[int], key: int, k: int) -> List[int]:
        index = set()
        for i in range(len(nums)):
            for j in range(len(nums)):
                if nums[i]==key:
                    if abs(i-j)<=k :
                        index.add(j)
        return index