class Solution {
    public int sumOfDigits(int num,int k){
        
        while(k>0){
            int sum = 0;
            while(num>0){
                sum+=num%10;
                num/=10;
            }
            num=sum;
            k--;
        }
        return num;
    }
    public int getLucky(String s, int k) {
        int num=0;
        for (int i = 0; i < s.length(); i++) {
            int val = (s.charAt(i) - 'a' + 1);
            while (val > 0) {
                num += val % 10;
                val /= 10;
            }
        }
        return sumOfDigits(num,k-1);
        // return num;
    }
}