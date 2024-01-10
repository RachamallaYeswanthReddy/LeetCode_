class Solution {
public:
    int maximumProduct(vector<int>& nums) {
        // int prod = 1;
        
        // If size of the array is 3
        
//         if(nums.size()== 3){
//             for(int num:nums){
//                 prod *= num;
//             }
//         }
        
        // if size of array is greater than 3
        
        // for(i = 1;)

        sort(nums.begin(),nums.end());
        
        int n = nums.size();
        
    	return max(nums[0]*nums[1]*nums[n-1],nums[n-1]*nums[n-2]*nums[n-3]);
        
        // return prod;
    }
};