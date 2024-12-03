class Solution {
    public int isPrefixOfWord(String sentence, String searchWord) {
        // int wordNumber=1;
        // for(int i=0;i<sentence.length();i++){
        //     if(sentence.charAt(i)==' '){
        //         wordNumber++;
        //     }
        //     if(sentence.charAt(i) == searchWord.charAt(0)){
        //         String str= sentence.substring(i,i+searchWord.length());
        //         if(searchWord.equals(str)){
        //             return wordNumber;
        //         }
        //     }
        // }
        
        String[] str = sentence.split(" ");
        for(int i=0;i<str.length;i++){
            if(str[i].startsWith(searchWord)){
                return i+1;
            }
        }
        return -1;
    }
}