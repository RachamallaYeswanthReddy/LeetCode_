class Solution {
    public int reverse(int x) {
        int temp = Math.abs(x);
        int reverse = 0;
        
        while (temp != 0) {
            int digit = temp % 10;
            if (reverse > (Integer.MAX_VALUE - digit) / 10) {
                // Overflow would occur if we proceed
                return 0;
            }
            reverse = reverse * 10 + digit;
            temp = temp / 10;
        }
        
        return x < 0 ? -reverse : reverse;
    }
}
