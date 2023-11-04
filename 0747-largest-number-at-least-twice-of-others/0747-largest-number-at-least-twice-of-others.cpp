class Solution {
public:
    int dominantIndex(vector<int>& nums) {
        int n = nums.size();
        for (int i = 0; i < n; i++) {
            bool isDominant = true;
            for (int j = 0; j < n; j++) {
                if (i != j && nums[i] < nums[j] * 2) {
                    isDominant = false;
                    break;
                }
            }
            if (isDominant) {
                return i;
            }
        }
        return -1;
    }
};