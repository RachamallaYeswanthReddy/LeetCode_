class Solution {
    public boolean isIsomorphic(String s, String t) {
        HashMap<Character, Character> map1 = new HashMap<>();
        HashMap<Character, Character> map2 = new HashMap<>();
        for(int i=0;i<s.length();i++){
            if(map1.containsKey(s.charAt(i)) && t.charAt(i) != map1.get(s.charAt(i))){
                return false;
            }
            map1.put(s.charAt(i),t.charAt(i));
        }
        for(int i=0;i<t.length();i++){
            if(map2.containsKey(t.charAt(i)) && s.charAt(i) != map2.get(t.charAt(i))){
                return false;
            }
            map2.put(t.charAt(i),s.charAt(i));
        }
        return true;
    }
}