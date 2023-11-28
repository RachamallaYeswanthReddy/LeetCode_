class Solution:
    def findMaxK(self, nums: List[int]) -> int:
        maximum_list=[]
        for i in nums:
            if (-i)in nums: 
                maximum_list.append(abs(i))
        return max(maximum_list,default=-1)
        