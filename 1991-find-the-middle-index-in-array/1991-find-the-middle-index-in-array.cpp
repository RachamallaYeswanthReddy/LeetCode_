class Solution {
public:
    int findMiddleIndex(vector<int>& nums) {
        int left_sum = 0; 
        int sum= 0;
        for(auto i:nums){sum+=i;}
        for(int i=0;i<nums.size();i++){
            if(left_sum ==  sum-nums[i]){
                return i;
            }
            left_sum += nums[i];
            sum-= nums[i];
        }
        return -1;
    }
};