class Solution {
public:
    int maximumDifference(vector<int>& nums) {
        int n = nums.size();
        int maxDiff = -1;
        int minElement = nums[0];

        for (int i = 1; i < n; i++) {
            maxDiff = std::max(maxDiff, nums[i] - minElement);
            minElement = std::min(minElement, nums[i]);
        }

        return (maxDiff > 0) ? maxDiff : -1;
    }
};