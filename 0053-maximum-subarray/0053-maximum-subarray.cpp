class Solution {
public:
    int maxSubArray(vector<int>& nums) {
        int maxi = INT_MIN;
        int current = 0;
        for(int i=0;i<nums.size();i++){
            current+= nums[i];
            if(current>maxi){
                maxi = current;
            }
            if(current<0){
                current = 0;
            }
        }
        return maxi;
    }
};