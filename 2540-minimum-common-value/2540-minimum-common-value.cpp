class Solution {
public:
    int getCommon(vector<int>& nums1, vector<int>& nums2) {
        if(nums1.size()==0 || nums2.size()==0){
            return -1;
        }
        unordered_map<int, int> countMap;
        for (int num : nums1) { countMap[num]++;}
        vector<int> intersection;
        for (int num : nums2) {
            if (countMap[num] > 0) {
                intersection.push_back(num);
                countMap[num]--;
            }
        }
        
        return intersection.size() >= 1 ? intersection[0] : -1;
    }
};