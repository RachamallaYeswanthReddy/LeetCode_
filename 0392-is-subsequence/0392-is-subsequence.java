class Solution {
    public boolean isSubsequence(String s, String t) {
        int i = 0, j = 0;
        
        // Edge cases: empty s is always a subsequence and if t is empty, s cannot be a subsequence
        if (s.length() == 0) {
            return true;
        }
        if (t.length() == 0) {
            return false;
        }
        
        // Iterate through t to find characters of s
        while (j < t.length()) {
            // If characters match, move to next character in s
            if (s.charAt(i) == t.charAt(j)) {
                i++;
                // If all characters of s are found, return true
                if (i == s.length()) {
                    return true;
                }
            }
            // Move to next character in t
            j++;
        }
        
        // If all characters of s are not found in t
        return false;
    }
}
