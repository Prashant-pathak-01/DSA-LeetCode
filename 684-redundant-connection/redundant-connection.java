class Solution {
    List<List<Integer>> list;
    public boolean dfs(int node,int parent,boolean visited[]){
        visited[node] = true;
        boolean res = false;
        for(int x:list.get(node)){
            if(!visited[x]) res = res|| dfs(x,node,visited);
            else if(x!=parent) return true;
        }
        return res;
    }
    public int[] findRedundantConnection(int[][] edges) {
        list = new ArrayList<>();
        for(int i=0; i<edges.length+1; i++) list.add(new ArrayList<>());
        for(int i=0; i<edges.length; i++){
            list.get(edges[i][0]).add(edges[i][1]);
            list.get(edges[i][1]).add(edges[i][0]);
            boolean visited[] = new boolean[edges.length+1];
            if(dfs(edges[i][0],-1,visited)) return edges[i];
        }
        return new int[]{-1,-1};
    }
}