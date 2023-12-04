class Solution {
public:
    int countTriples(int n) {
        int temp,k,count = 0;
        for(int i=1;i<n;i++){
            for(int j=1;j<n;j++){
                temp = i*i+j*j;
                k = sqrt(temp);
                if(sqrt(temp)<=n && k*k ==temp){
                    count++;
                }
            }
        }
        return count;
    }
};