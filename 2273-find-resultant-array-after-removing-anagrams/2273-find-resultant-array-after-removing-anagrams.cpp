class Solution {
public:
    vector<string> removeAnagrams(vector<string>& words) {
        for (int i = 1; i < words.size(); ) {
            string s = words[i];
            string t = words[i-1];

            sort(s.begin(), s.end());
            sort(t.begin(), t.end());

            if (s == t) {
                words.erase(words.begin() + i);
            } else {
                i++;
            }
        }

        return words;
    }
};