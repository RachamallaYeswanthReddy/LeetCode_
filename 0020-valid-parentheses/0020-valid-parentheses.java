class Solution {
    public boolean isValid(String s) {
        // char x1 = '(';
        // char x2 = ')';
        // char y1 = '{';
        // char y2 = '}';
        // char z1 = '[';
        // char z2 = ']';
        Stack<Character> stack1 = new Stack<Character>();
        for(char c: s.toCharArray()){
            if(c=='(' || c == '{' || c == '['){
                stack1.push(c);
            }
            else{
                if(stack1.isEmpty()){
                    return false;
                }
                char top = stack1.peek();
                if ((c == ')' && top == '(') || (c == ']' && top == '[') 
                    || (c == '}' && top == '{')) {
                    stack1.pop();
                }
                else return false;
            }
        }
        return stack1.isEmpty();
    }
}