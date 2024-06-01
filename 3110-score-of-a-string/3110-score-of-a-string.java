class Solution {
    public int scoreOfString(String s) {
        int val = 0;
        for(int i=0;i<s.length()-1;i++){
            int ch = s.charAt(i) - '0';
            int ch1 = s.charAt(i+1) - '0';
            // int x = ch - '0';
            // int y = ch1 - '0';
            val+= Math.abs(ch-ch1);
        }
        return val;
    }
}