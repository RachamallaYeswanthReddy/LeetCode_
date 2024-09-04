class Solution {
    public boolean isBipartite(int[][] graph) {
        int[] colors = new int[graph.length];
        for(int i=0;i<graph.length;i++){
            colors[i] = -1;
        }
        for(int i=0;i<graph.length;i++){
            if(colors[i]==-1){
                if(!coloredGraph(i,graph,colors)){
                    return false;
                }
            }
        }
        return true;
    }
    public boolean coloredGraph(int s,int[][] graph,int[] colors){
        Queue<Integer>q = new LinkedList<>();
        q.add(s);
        colors[s] = 0;
        while(!q.isEmpty()){
            int p = q.poll();
            for(int v:graph[p]){
                if(colors[v]==-1){
                    colors[v] = 1 - colors[p];
                    q.add(v);
                }else if(colors[v]==colors[p]){
                    return false;
                }
            }
        }
        return true;
    }
}