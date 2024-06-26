class Solution {
    public boolean isPalindrome(int x) {
        if(x<0){
            return false;
        }
        int temp = Math.abs(x);
        int newNum = 0;
        while(temp!=0){
            int digit = temp%10;
            newNum = newNum*10+digit;
            temp/=10;
        }
        return x==newNum;
    }
}