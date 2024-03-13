class Solution {
    public int pivotInteger(int n) {
        if(n== 1){
            return 1;
        }
        int left_sum = 0;
        int right_sum = (n*(n+1)/2);
        for(int i=0;i<=n;i++){
            left_sum+= i;
            right_sum-=i;
            if(left_sum == right_sum+i){
                return i;
            }
        }
        return -1;
    }
}