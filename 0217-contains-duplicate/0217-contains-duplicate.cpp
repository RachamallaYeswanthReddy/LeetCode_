class Solution {
public:
    bool containsDuplicate(vector<int>& nums) {
        set<int> nums2(nums.begin(),nums.end());
        // if(nums.size()-nums2.size()>0) return true;
        // else return false;
        return nums.size()-nums2.size();
    }
};