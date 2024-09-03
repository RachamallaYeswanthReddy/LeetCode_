class Solution {
    public int numEnclaves(int[][] grid) {
        // now we need to create visted array and queue to check the borders
        int m = grid.length;
        int n = grid[0].length;
        boolean[][]visted= new boolean[m][n];
        Queue<int[]> q=new LinkedList<>();
        for(int i=0;i<m;i++){
            for(int j=0;j<n;j++){
                if((i==0||i==m-1|| j==0 || j == n-1)&& grid[i][j] == 1){
                    q.add(new int[]{i,j});
                    visted[i][j] = true; 
                }
            }
        }
        int[] row = {0,-1,0,1};
        int[] col = {-1,0,1,0};
        while(!q.isEmpty()){
            int[] index= q.poll();
            int nrow = index[0];
            int ncol = index[1];
            for(int i=0;i<4;i++){
                int nr = nrow+row[i];
                int nc = ncol+col[i];
                if(nr>=0 && nr<m&&nc>=0 &&nc<n && !visted[nr][nc] && grid[nr][nc] == 1){
                    visted[nr][nc] = true;
                    q.add(new int[]{nr,nc});
                }
            }
        }
        int count=0;
        for(int i=0;i<m;i++){
            for(int j=0;j<n;j++){
                if(grid[i][j]==1 &&!visted[i][j]) count++;
            }
        }
        return count;
    }
}