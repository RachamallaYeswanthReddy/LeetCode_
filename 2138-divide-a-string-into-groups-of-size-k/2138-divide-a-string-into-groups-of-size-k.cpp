class Solution {
public:
    vector<string> divideString(string s, int k, char fill) {
        vector<string> result;

        int n = s.size();
        int i = 0;

        while (i < n) {
            string group = s.substr(i, k); 
            while (group.size() < k) {
                group.push_back(fill);
            }

            result.push_back(group);
            i += k;
        }

        return result;
    }
};