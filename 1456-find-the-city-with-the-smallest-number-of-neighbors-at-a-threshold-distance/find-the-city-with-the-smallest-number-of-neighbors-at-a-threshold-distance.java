class Solution {
    public void checkDistance(int i, int dis[], List<List<int []>> list){
        Queue<int []> q = new LinkedList<>();
        q.add(new int[]{i,0});
        while(!q.isEmpty()){
            int temp[] = q.poll();
            for(int x[]: list.get(temp[0])){
                if(dis[x[0]]>temp[1]+x[1]){
                    dis[x[0]] = temp[1]+x[1];
                    q.add(new int[]{x[0],temp[1]+x[1]});
                }
            }
        }
    }
    public int findTheCity(int n, int[][] edges, int distanceThreshold) {
        List<List<int []>> list =  new ArrayList<>();
        for(int i=0; i<n; i++) list.add(new ArrayList<>());
        for(int i=0; i<edges.length; i++){
            list.get(edges[i][0]).add(new int[]{edges[i][1],edges[i][2]});
            list.get(edges[i][1]).add(new int []{edges[i][0],edges[i][2]});
        }
        int min = Integer.MAX_VALUE;
        int res= -1;
        for(int i=0; i<n; i++){
            int dis[] = new int[n];
            Arrays.fill(dis,Integer.MAX_VALUE);
            dis[i] = 0;
            checkDistance(i,dis,list);
            int count = 0;
            for(int x:dis) if(x<=distanceThreshold) count++;
            if(min>=count) {
                res = i;
                min = count;
            }
        }
        return res;
    }
}