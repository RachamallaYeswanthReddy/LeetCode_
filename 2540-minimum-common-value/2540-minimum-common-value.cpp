
class Solution {
public:
    int getCommon(vector<int>& nums1, vector<int>& nums2) {
        if (nums1.empty() || nums2.empty()) {
            return -1;
        }

        unordered_map<int, int> countMap;
        int minCommon = INT_MAX; // Initialize with a large value

        for (int num : nums1) {
            countMap[num]++;
        }

        for (int num : nums2) {
            if (countMap[num] > 0) {
                minCommon = min(minCommon, num);
                countMap[num]--;
            }
        }

        return (minCommon == INT_MAX) ? -1 : minCommon;
    }
};
