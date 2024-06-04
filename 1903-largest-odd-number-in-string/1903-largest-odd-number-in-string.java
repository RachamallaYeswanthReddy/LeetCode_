class Solution {
    public String largestOddNumber(String num) {
        // StringBuilder str = new StringBuilder();
        // int n = num.length();
        // num = num.replaceAll("0","");
        // int x = Integer.parseInt(num);
        // if(x%2 != 0){
        //     return num;
        // }
        // n = num.length();
        // for(int i=0;i<n;i++){
        //     char ch = num.charAt(i);
        //     int nums = Character.getNumericValue(ch);
        //     if(nums%2!=0 ){
        //         str.append(ch);
        //     }
        // }
//         In above approach we are extracting only odd digits but we need to extract the odd
        
        int n = num.length(),i=n-1;
        while(i>=0 && num.charAt(i)%2==0){
            i--;
        }
        if(i<0)return "";
        return num.substring(0,i+1);
        // return str.toString();
    }
}