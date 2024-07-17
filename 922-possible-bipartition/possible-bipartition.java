class Solution {
    List<List<Integer>> list;
    public boolean bfs(int node, int visited[]){
        Queue<Integer> q = new LinkedList<>();
        q.add(node);
        visited[node] = 1;
        while(!q.isEmpty()){
            int temp = q.poll();
            int color = visited[temp]==1?-1:1;
            for(int x:list.get(temp)){
                if(visited[x]==0) {
                    q.add(x);
                    visited[x] = color;
                }
                else if(visited[x]==visited[temp]) return false;
                
            }
        }
        return true;
    }
    public boolean possibleBipartition(int n, int[][] dislikes) {
        list = new ArrayList<>();
        for(int i=0; i<=n; i++) list.add(new ArrayList<>());
        for(int i=0; i<dislikes.length; i++){
            list.get(dislikes[i][0]).add(dislikes[i][1]);
            list.get(dislikes[i][1]).add(dislikes[i][0]);
        }
        int visited[] = new int[n+1];
        for(int i=1; i<=n; i++){
            if(visited[i]==0){
                if(!bfs(i,visited)) return false;
            }
        }
        return true;
    }
}