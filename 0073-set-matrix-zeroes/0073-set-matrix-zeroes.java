class Solution {
    public void setZeroes(int[][] matrix) {
        HashSet<Integer> row = new HashSet<>();
        HashSet<Integer> col = new HashSet<>();
        int rowLen = matrix.length;
        int colLen = matrix[0].length;
        for(int i=0;i<rowLen;i++){
            for(int j=0;j<colLen;j++){
                if(matrix[i][j]==0){
                    row.add(i);
                    col.add(j);
                }
            }
        }
        for(int i=0;i<rowLen;i++){
            for(int j=0;j<colLen;j++){
                if(row.contains(i) || col.contains(j)){
                    matrix[i][j]=0;
                }
            }
        }
    }
}