class Solution {
    public String removeOuterParentheses(String s) {
        int count=0,nonPar=0;

        StringBuilder str = new StringBuilder();
        for(char ch : s.toCharArray()){
            if(ch == '('){
                if(count>0) str.append(ch);
                count++;
            }else if(ch == ')'){
                count--;
                if(count >0) str.append(ch);
            }
        }
        return str.toString();
    }
}