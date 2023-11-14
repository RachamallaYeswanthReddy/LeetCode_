class Solution {
public:
    int smallestRangeI(vector<int>& nums, int k) {
        int maxi = nums[0];
        int mini = nums[0];
        for(int a : nums){
            maxi = max(maxi,a);
            mini = min(mini,a);
        }
        return max(0,maxi-mini-2*k);
    }
};