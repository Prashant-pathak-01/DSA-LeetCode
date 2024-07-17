class Solution {
    int [][] list;
    public boolean bfs(int node, int visited[]){
        Queue<Integer> q = new LinkedList<>();
        q.add(node);
        visited[node] = 1;
        while(!q.isEmpty()){
            int temp = q.poll();
            int color = visited[temp]==1?-1:1;
            for(int x:list[temp]){
                if(visited[x]==0) {
                    q.add(x);
                    visited[x] = color;
                }
                else if(visited[x]==visited[temp]) return false;
                
            }
            
        }
        return true;
    }
    public boolean isBipartite(int[][] graph) {
        list = graph;
        int visited[] = new int[graph.length];
        for(int i=0; i<graph.length; i++){
            if(visited[i]==0){
                if(!bfs(i,visited)) return false;
            }
        }
        return true;
    }
}