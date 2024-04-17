import java.util.HashMap;

class Solution {
    public boolean wordPattern(String pattern, String str) {
        HashMap<Character, String> map = new HashMap<>();
        String[] words = str.split(" ");

        if (pattern.length() != words.length)
            return false;

        for (int i = 0; i < pattern.length(); i++) {
            char ch = pattern.charAt(i);
            String word = words[i];

            if (map.containsKey(ch) && !map.get(ch).equals(word)) {
                return false;
            }

            if (map.containsValue(word) && !map.containsKey(ch)) {
                return false;
            }

            map.put(ch, word);
        }

        return true;
    }
}
