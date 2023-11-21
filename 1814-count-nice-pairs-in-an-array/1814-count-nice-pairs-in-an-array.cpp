class Solution {
public:
    int countNicePairs(vector<int>& nums){
        const int mod = 1e9 + 7;
        int count = 0;
        unordered_map<int, int> frequency;

        auto reverseNumber = [](int num) {
            int reversed = 0;
            while (num > 0) {
                reversed = reversed * 10 + num % 10;
                num /= 10;
            }
            return reversed;
        };

        for (int i : nums) {
            int diff = i - reverseNumber(i);
            count = (count + frequency[diff]) % mod;
            frequency[diff]++;
        }

        return count;
    }
};
