class Solution {
    public int solve(Map<Integer,List<Integer>> map,int arr[][], int s, int d){
        Queue<Integer> q = new LinkedList<>();
        Set<Integer> visited = new HashSet<>();
        Set<Integer> busVisited = new HashSet<>();
        q.add(s);
        visited.add(s);
        int res =0;
        while(!q.isEmpty()){
            int size = q.size();
            while(size-->0){
                int temp = q.poll();
                if(temp==d) return res;
                for(int bus:map.get(temp)){
                    if(busVisited.contains(bus)) continue;
                    for(int x:arr[bus]){
                        if(!visited.contains(x)){
                            q.add(x);
                            visited.add(x);
                        }
                    }
                    busVisited.add(bus);
                }
            }
            res++;
        }
        return -1;
    }
    public int numBusesToDestination(int[][] routes, int source, int target) {
        if(source==target) return 0;
        Map<Integer,List<Integer>> map = new HashMap<>(); 
        for(int i=0; i<routes.length; i++){
            for(int j=0; j<routes[i].length; j++){
                List<Integer> list = map.getOrDefault(routes[i][j],new ArrayList<>());
                if(!list.contains(i)) list.add(i);
                map.put(routes[i][j],list);
            }
        }
        if(!map.containsKey(source)) return -1;
        return solve(map,routes,source,target);
    }
}