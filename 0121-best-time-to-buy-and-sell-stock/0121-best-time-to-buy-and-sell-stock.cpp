class Solution {
public:
    int maxProfit(vector<int>& prices) {
        int mini = prices[0];
        int maxi = 0;
        for(int price:prices){
            mini = min(price,mini);
            maxi = max(price-mini,maxi);
        }
        return maxi;
    }
};