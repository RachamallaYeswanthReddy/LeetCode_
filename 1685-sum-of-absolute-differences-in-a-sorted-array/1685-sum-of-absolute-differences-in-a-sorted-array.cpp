#include <vector>

class Solution {
public:
    vector<int> getSumAbsoluteDifferences(vector<int>& nums) {
        int sum = 0;
        for(int n : nums){
            sum += n;
        }

        int left = 0;
        int right = sum;

        vector<int> r(nums.size(), 0);  // Using std::vector to store the results

        for (int i = 0; i < nums.size(); i++) {
            int n = nums[i];
            right -= n;

            r[i] = n * i - left + right - n * (nums.size() - i - 1);

            left += n;
        }
        return r;
    }
};
