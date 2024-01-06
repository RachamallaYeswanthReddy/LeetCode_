class Solution {
public:
    int minimumOperations(vector<int>& nums) {
        int count = 0;

        nums.erase(std::remove(nums.begin(), nums.end(), 0), nums.end());

        if (nums.empty()) return 0;

        while (!nums.empty()) {
            sort(nums.begin(), nums.end());

            int x = nums[0];

            count++;

            for (int& num : nums) {
                num -= x;
            }

            nums.erase(std::remove(nums.begin(), nums.end(), 0), nums.end());
        }

        return count;
    }
};