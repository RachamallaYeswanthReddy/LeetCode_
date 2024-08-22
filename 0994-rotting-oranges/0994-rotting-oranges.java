
class Pair{
    int row;
    int col;
    int time;
    Pair(int r,int c,int t){
        this.row = r;
        this.col = c;
        this.time = t;
    }
}
class Solution {
    public int orangesRotting(int[][] grid) {
        Queue<Pair> q = new LinkedList<>();
        int[][]visted = new int[grid.length][grid[0].length];
        int freshOra = 0;
        for(int i=0;i<grid.length;i++){
            for(int j=0;j<grid[0].length;j++){
                if(grid[i][j] == 2){
                    q.add(new Pair(i,j,0));
                    visted[i][j] = 2;
                }else if(grid[i][j] == 1){
                    freshOra++;
                }
            }
        }
        if(freshOra == 0) return 0;
        
        
        int min=0,cnt = 0;
        int[] x = {-1,0,1,0};
        int[] y = {0,1,0,-1};
        
        while(!q.isEmpty()){
            Pair curr = q.poll();
            int r = curr.row;
            int c = curr.col;
            int t = curr.time;
            for(int i=0;i<4;i++){
                int nrow = r+x[i];
                int ncol = c+y[i];
                if(nrow>=0 && nrow<grid.length && ncol>=0 && ncol<grid[0].length&& visted[nrow][ncol] == 0 && grid[nrow][ncol] == 1){
                    q.add(new Pair(nrow,ncol,t+1));
                    visted[nrow][ncol] = 2;
                    freshOra--;
                    min = t+1;
                }
            }
        }
        return freshOra == 0 ? min:-1;
    }
}