class Solution {
    public int numberOfSubstrings(String s) {
        int []lastSeen = {-1,-1,-1};
        int l=0,r=0,count=0;
        while(r<s.length()){
            char ch = s.charAt(r);
            lastSeen[ch-'a'] = r;
            count+= 1+Math.min(lastSeen[0],Math.min(lastSeen[1],lastSeen[2]));
            r++;
        }
        return count;
    }
}