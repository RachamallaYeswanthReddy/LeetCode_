class Solution {
public:
    string longestCommonPrefix(vector<string>& strs) {
        if (strs.empty()) {
        return "";
    }

    string common = strs[0];
    for (int i = 1; i < strs.size(); ++i) {
        const string& curr = strs[i];
        int j = 0;
        while (j < common.size() && j < curr.size() && common[j] == curr[j]) {
            ++j;
        }

        common = common.substr(0, j);
    }
    return common;
    }
};