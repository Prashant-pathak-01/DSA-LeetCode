class Solution {
    public List<List<Integer>> getAncestors(int n, int[][] edges) {
        List<List<Integer>> graph = new ArrayList<>();
        int degree[] = new int[n];
        for(int i=0; i<n; i++) graph.add(new ArrayList<>());
        for(int i[]:edges){
            graph.get(i[0]).add(i[1]);
            degree[i[1]]++;
        }

        Queue<Integer> q = new LinkedList<>();
        
        List<List<Integer>> res = new ArrayList<>();
        for(int i=0; i<n; i++) res.add(new ArrayList<>());
        for(int i=0; i<n; i++) if(degree[i]==0) q.add(i);
        while(!q.isEmpty()){
            int prev = q.poll();
            for(int i:graph.get(prev)){
                degree[i]--;
                res.get(i).add(prev);
                for(int j:res.get(prev)) if(!res.get(i).contains(j)) res.get(i).add(j);
                if(degree[i]==0) {
                    Collections.sort(res.get(i));
                    q.add(i);
                }
            }
        }
        return res;
    }
}