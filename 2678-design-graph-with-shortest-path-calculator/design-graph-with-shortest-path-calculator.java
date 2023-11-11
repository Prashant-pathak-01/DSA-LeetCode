class Graph {
    List<List<int []>> list;
    public Graph(int n, int[][] edges) {
        list= new ArrayList<>(n);
        for(int i =0 ;i<n; i++){
            list.add(new ArrayList<>());
        }
        for(int i[]:edges){
            addEdge(i);
        }
    }
    
    public void addEdge(int[] edge) {
        int arr[] = {edge[1],edge[2]};
        list.get(edge[0]).add(arr);


    }
    
    public int shortestPath(int node1, int node2) {
        int distance[] = new int[list.size()];
        Arrays.fill(distance,Integer.MAX_VALUE);
        distance[node1] = 0;
        PriorityQueue<int[]> pq = new PriorityQueue<>(Comparator.comparingInt(o -> o[0]));
        pq.add(new int[]{0,node1});
        while(!pq.isEmpty()){
            int temp[] = pq.poll();
            if(temp[0]>distance[temp[1]]) continue;
            if(temp[1]==node2) return temp[0];
            for(int []edge: list.get(temp[1])){
                if(distance[edge[0]]>edge[1]+distance[temp[1]]){
                    distance[edge[0]] = edge[1]+distance[temp[1]];
                    pq.add(new int[]{edge[1]+distance[temp[1]],edge[0]});
                }
            }
        }
        return (distance[node2]==Integer.MAX_VALUE)?-1:distance[node2];
    }
}

