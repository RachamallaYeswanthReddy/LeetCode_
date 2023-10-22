class Solution:
    def maximumScore(self, nums: List[int], k: int) -> int:
        left = k
        right = k
        mini = nums[k]
        maxi = mini
        while left>0 or right < len(nums)-1:
            if left == 0 or (right < len(nums)-1 and nums[right+1]>nums[left-1]):
                right+=1
            else:
                left-=1
            mini = min(mini, nums[left],nums[right])
            maxi = max(maxi, mini*(right-left+1))
            
        return maxi