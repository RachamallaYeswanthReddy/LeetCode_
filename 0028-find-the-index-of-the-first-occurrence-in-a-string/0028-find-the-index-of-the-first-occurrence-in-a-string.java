class Solution {
    public boolean containsAll(String needle,String subString){
        boolean found = true;
        int needleLen = needle.length();
        for(int i=0;i<needleLen;i++){
            if(subString.charAt(i) != needle.charAt(i)){
                found = false;
            }
        }
        return found;

    }
    public int strStr(String haystack, String needle) {
        int haystackLen = haystack.length();
        int needleLen = needle.length();
        if(needleLen>haystackLen){
            return -1;
        }
        for(int i=0;i<=haystackLen-needleLen;i++){
            if(haystack.charAt(i)== needle.charAt(0)){
                String subString =haystack.substring(i,i+needleLen);
                if(containsAll(needle,subString)){
                    return i;
                }
            }
        }
        return -1;
    }
}