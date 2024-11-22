class Pair{
    int row;
    int col;
    Pair(int x,int y){
        row = x;
        col = y;
    }
}
class Solution {
    public int numIslands(char[][] grid) {
        int m = grid.length;
        int n = grid[0].length;
        int[][] visted =new int[m][n];
        Queue<Pair> q= new LinkedList<>();
        int count = 0;
        for(int i=0;i<m;i++){
            for(int j=0;j<n;j++){
                if(visted[i][j]== 0 && grid[i][j]=='1'){
                    count++;
                    q.add(new Pair(i,j));
                    bfs(q,visted,grid);
                    
                }
            }
        }
        return count;
    }
    public void bfs(Queue<Pair> q,int[][] visted,char[][] grid){
        int m = grid.length;
        int n = grid[0].length;
        int[]x = {-1,0,1,0};
        int[]y = {0,1,0,-1};
        while(!q.isEmpty()){
            Pair p = q.poll();
            int nrow=p.row;
            int ncol=p.col;
            visted[nrow][ncol] = 1;
            for(int i=0;i<4;i++){
                if(nrow+x[i]>=0 && nrow+x[i]<m && ncol+y[i]>=0 && ncol+y[i]<n){
                    if(visted[nrow+x[i]][ncol+y[i]]== 0 && grid[nrow+x[i]][ncol+y[i]]=='1'){
                        visted[nrow+x[i]][ncol+y[i]] = 1;
                        q.add(new Pair(nrow+x[i], ncol+y[i]));
                    }
                }
            }
        }
    }
}