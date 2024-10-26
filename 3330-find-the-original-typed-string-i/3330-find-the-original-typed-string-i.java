class Solution {
    public int possibleStringCount(String word) {
        // HashSet<Character> set = new HashSet<>();
        // for(int i=0;i<word.length();i++){
        //     set.add(word.charAt(i));
        // }
        int count =0;
        HashMap<Character,Integer> map= new HashMap<>();
        for(int i=0;i<word.length();i++){
            char ch = word.charAt(i);
            map.put(ch,map.getOrDefault(ch,0)+1);
            if(map.get(ch)>1 && word.charAt(i-1) == ch){
                count++;
            }
        }
        return count+1;
    }
}