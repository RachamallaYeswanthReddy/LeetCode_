class Solution {
    public int[] xorQueries(int[] arr, int[][] queries) {
        int res[] = new int[queries.length];
        for(int i=0;i<queries.length;i++){
            int left= queries[i][0];
            int right= queries[i][1];
            if(left == right) res[i] = arr[left];
            else {
                res[i] = xorOper(arr,left,right);
            }
        }
        return res;
    }
    public int xorOper(int[]arr,int left,int right){
        int res = arr[left];
        if(left-right==1) return arr[left]^arr[right];  
        for(int i=left+1;i<right+1;i++){
            res^=arr[i];
        }
        return res;
    }
}