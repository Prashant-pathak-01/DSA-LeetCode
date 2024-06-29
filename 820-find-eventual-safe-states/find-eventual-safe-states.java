class Solution {
    public List<Integer> eventualSafeNodes(int[][] graph) {
        List<Integer> res = new ArrayList<>();
        List<List<Integer>> graphMap = new ArrayList<>();
        int degree[] = new int[graph.length];
        for(int i=0; i<graph.length; i++){
            graphMap.add(new ArrayList<>());
        }
        for(int i=0; i<graph.length; i++){
            for(int j:graph[i]){
                graphMap.get(j).add(i);
                degree[i]++;
            }
        }
        Queue<Integer> q = new LinkedList<>();
        for(int i=0; i<degree.length; i++) if(degree[i]==0) q.add(i);
        while(!q.isEmpty()){
            int prev = q.poll();
            res.add(prev);
            for(int j:graphMap.get(prev)){
                degree[j]--;
                if(degree[j]==0) q.add(j);
            }
        }
        Collections.sort(res);
        return res;
    }
}