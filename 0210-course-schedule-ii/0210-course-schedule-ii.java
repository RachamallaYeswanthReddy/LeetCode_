class Solution {
    public int[] findOrder(int numCourses, int[][] prerequisites) {
        // we need to create adj list first`
        ArrayList<ArrayList<Integer>>adj = new ArrayList<>();
        for(int i=0;i<numCourses;i++){
            adj.add(new ArrayList<>());
        }
        for(int i=0;i<prerequisites.length;i++){
            adj.get(prerequisites[i][0]).add(prerequisites[i][1]);
        }
        
        int[] inDegree = new int[numCourses];
        Queue<Integer> q = new LinkedList<>();
        for(int i=0;i<numCourses;i++){
            for(int u:adj.get(i)){
                inDegree[u]++;
            }
        }
        for(int i=0;i<numCourses;i++){
            if(inDegree[i] == 0) q.add(i);
        }
        return checkCourses(numCourses,inDegree,adj,q);
    }
    public int[] checkCourses(int n,int[] inDegree,ArrayList<ArrayList<Integer>>adj,Queue<Integer> q){
        int[]res = new int[n];
        int ind = 0;
        int count =0;
        Stack<Integer> st = new Stack<>();
        while(!q.isEmpty()){
            int V = q.poll();
            count++;
            st.push(V);
            for(int u:adj.get(V)){
                inDegree[u]--;
                if(inDegree[u]==0) q.add(u);
            }
        }
        while(!st.isEmpty()){
            res[ind++] = st.pop();
        }
        return count==n?res:new int[]{};
    }
}