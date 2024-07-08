class Solution {
    public int findCircleNum(int[][] isConnected) {
        int provinces = 0;
        int v = isConnected.length;
        boolean visted[]= new boolean[v];
        for(int i=0;i<v;i++){
            if(visted[i]==false){
                provinces++;
                BFS(isConnected,i,visted);
            }
        }
        return provinces;
    }
    public void BFS(int[][] con,int n,boolean[] visted){
        Queue<Integer> q = new LinkedList<>();
        q.add(n);
        visted[n]= true;
        while(!q.isEmpty()){
            int curr = q.poll();
            for(int i=0;i<con[curr].length;i++){
                if(con[curr][i] == 1 && !visted[i]){
                    q.add(i);
                    visted[i] = true;
                }
            }
        }
    }
    
}