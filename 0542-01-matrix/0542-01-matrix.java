class Pair{
    int row,col,dis;
    Pair(int row,int col,int dis){
        this.row=row;
        this.col = col;
        this.dis = dis;
    }
}
class Solution {
    public int[][] updateMatrix(int[][] mat) {
        int m = mat.length, n = mat[0].length;
        int[][] res = new int[m][n];
        boolean[][] visted= new boolean[m][n];
        Queue<Pair> q = new LinkedList<>();
        int count=0;
        for(int i=0;i<m;i++){
            for(int j=0;j<n;j++){
                if(mat[i][j] == 0){
                    q.add(new Pair(i,j,0));
                    visted[i][j] = true;
                }
            }
        }
        int[] up = {0,-1,0,1};
        int[] down = {-1,0,1,0};
        while(!q.isEmpty()){
            Pair p = q.poll();
            int nrow= p.row;
            int ncol = p.col;
            int distance = p.dis;
            res[nrow][ncol] = distance;
            visted[nrow][ncol] = true;
            for(int i=0;i<4;i++){
                int nr =up[i]+nrow;
                int nc =down[i]+ncol;
                if(nr>=0 &&nr<m && nc>=0 && nc<n &&!visted[nr][nc]){
                    q.add(new Pair(nr,nc,distance+1));
                    visted[nr][nc] = true;
                }
            }
        }
        return res;
    }
}