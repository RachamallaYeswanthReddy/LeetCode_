class Solution {
public:
    string largestGoodInteger(string num) {
        string result = "";
        for (int i = 0; i < num.length() - 2; i++) {
            if (num[i] == num[i + 1] && num[i] == num[i + 2]) {
                if (num.substr(i, 3) > result) {
                    result = num.substr(i, 3);
                }
            }
        }
        return result;
    }
};