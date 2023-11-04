class Solution {
public:
    int findFinalValue(vector<int>& nums, int original) {
        int curr=original;
        while (find(nums.begin(),nums.end(),curr)!= nums.end()){
            curr= curr*2;
        }
        return curr;
    }
};