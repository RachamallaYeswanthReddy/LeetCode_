class Solution {
    public String minWindow(String s, String t) {
        if (s == null || t == null || s.length() < t.length()) return "";
        int arr[] = new int[256];
        for(char c : t.toCharArray()) arr[c]++;
        int l=0,r=0,minLen = Integer.MAX_VALUE,count=0,sIndex=-1;
        while(r<s.length()){
            if(arr[s.charAt(r)]>0)count++;
            arr[s.charAt(r)]--;
            r++;
            while(count==t.length()){
                if(r-l <minLen){
                    minLen = r-l;
                    sIndex=l;
                }
                arr[s.charAt(l)]++;
                if(arr[s.charAt(l)] > 0) count--;
                l++;
            }
        }
        return sIndex==-1?"" :s.substring(sIndex,sIndex+minLen);
    }
}