class Solution {
    public int minReorder(int n, int[][] connections) {
        Map<Integer,List<Integer>> map = new HashMap<>();
        for(int i=0; i<n; i++) map.put(i,new ArrayList<>());
        for(int i=0; i<connections.length; i++){
            List<Integer> list1 = map.getOrDefault(connections[i][0], new ArrayList<>());
            list1.add(connections[i][1]);
            map.put(connections[i][0],list1);
            List<Integer> list2 = map.getOrDefault(connections[i][1], new ArrayList<>());
            list2.add(-1*connections[i][0]);
            map.put(connections[i][1],list2);
        }
        boolean visited[] = new boolean[n];
        int res =0;
        Queue<Integer> q = new LinkedList<>();
        q.add(0);
        while(!q.isEmpty()){
            int temp = q.poll();
            visited[temp] = true;
            List<Integer> list = map.get(temp);
            for(int x:list){
                if(!visited[Math.abs(x)]){
                    if(x<0) res++;
                    q.add(Math.abs(x));
                }
            }
        }
        return n-res-1;
    }
}