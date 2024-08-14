class Solution {
    public int countCharacters(String[] words, String chars) {
        HashMap<Character,Integer> map=new HashMap<>();
        for(int i=0;i<chars.length();i++){
            map.put(chars.charAt(i),map.getOrDefault(chars.charAt(i),0)+1);
        }
        int res = 0;
        for(int i=0;i<words.length;i++){
            boolean isValid = contains(words[i],map);
            if(isValid)res+=words[i].length(); 
        }
        return res;
    }
    public boolean contains(String word, HashMap<Character,Integer> map){
        int[] count= new int[26];
        for(int i=0;i<word.length();i++){
            count[word.charAt(i)-'a']++;
            if(count[word.charAt(i)-'a']>map.getOrDefault(word.charAt(i),0)){
                return false;
            }
        }
        return true;
    }
}