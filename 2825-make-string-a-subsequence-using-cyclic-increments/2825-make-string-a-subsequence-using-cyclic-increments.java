class Solution {
    public boolean canMakeSubsequence(String str1, String str2) {
        int r = 0;
        StringBuilder str = new StringBuilder();
        for (int i = 0; i < str1.length() && r < str2.length(); i++) {
            char ch = str1.charAt(i);
            
            char nextChar = (ch == 'z') ? 'a' : (char) (ch + 1);
            
            if (ch == str2.charAt(r) || nextChar == str2.charAt(r)) {
                r++;
            }
        }

        return r == str2.length();
    }
}