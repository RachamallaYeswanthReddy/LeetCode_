class Solution:
    def sortEvenOdd(self, nums: List[int]) -> List[int]:
        even_index = []
        odd_index = []
        for i in range(len(nums)):
            if i%2 == 0:
                even_index.append(nums[i])
            else:
                odd_index.append(nums[i])
        even_index = sorted(even_index)
        odd_index = sorted(odd_index,reverse = True)
        
        new_list = []
        for i in range(len(nums)):
            if i%2== 0:
                new_list.append(even_index[i//2])
            else:new_list.append(odd_index[i//2])
            
        return new_list