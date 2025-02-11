class Solution {
    public int solve(Map<Integer,List<Integer>> map, Set<Integer> set,int node,int parent){
        if(set.contains(node)) return 0;
        int res =1;
        for(int x:map.get(node)) {
            if(x!=parent) res+=solve(map,set,x,node);
        }
        return res;
    }
    public int reachableNodes(int n, int[][] edges, int[] restricted) {
        Map<Integer,List<Integer>> map = new HashMap<>();
        for(int i=0; i<edges.length; i++){
            List<Integer> l1 = map.getOrDefault(edges[i][0],new ArrayList<>());
            l1.add(edges[i][1]);
            map.put(edges[i][0],l1);

            List<Integer> l2 = map.getOrDefault(edges[i][1],new ArrayList<>());
            l2.add(edges[i][0]);
            map.put(edges[i][1],l2);
        }
        Set<Integer> set = new HashSet<>();
        for(int i:restricted) set.add(i);
        return solve(map,set,0,-1);
        
    }
}