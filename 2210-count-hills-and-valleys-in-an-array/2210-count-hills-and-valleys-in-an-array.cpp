class Solution {
public:
    int countHillValley(vector<int>& nums) {
        int res = 0;
        int left = 0;  
        for (int right = 1; right < nums.size() - 1; ++right) {  
            if ((nums[left] < nums[right] && nums[right] > nums[right + 1]) || 
                (nums[left] > nums[right] && nums[right] < nums[right + 1])) {
                ++res;
            }

            if (nums[right] != nums[right + 1]) {
                left = right;
            }
        }
        return res;
    }
};


