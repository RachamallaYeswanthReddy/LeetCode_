class Solution:
    def maximumUniqueSubarray(self, nums: List[int]) -> int:
        n = len(nums)
        left = {}
        left_sum = 0
        max_score = 0
        window_start = 0

        for window_end in range(n):
            if nums[window_end] in left:
                window_start = max(window_start, left[nums[window_end]] + 1)
            left[nums[window_end]] = window_end
            max_score = max(max_score, sum(nums[window_start:window_end + 1]))

        return max_score