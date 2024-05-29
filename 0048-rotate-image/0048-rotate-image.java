class Solution {
    public void rotate(int[][] matrix) {
        int n = matrix[0].length;
        int[][] newArr = new int[n][n];
        
        for(int i=0;i<n;i++){
            for(int j=0;j<n;j++){
                newArr[i][j] = matrix[n-j-1][i];
            }
        }
        for(int i=0;i<n;i++){
            for(int j=0;j<n;j++){
                matrix[i][j] = newArr[i][j];
            }
        }
    }
}