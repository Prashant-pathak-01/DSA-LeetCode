class Solution {
    class Node{
        int node;
        int dist;
        Node(int node, int dist){
            this.node = node;
            this.dist = dist;
        }
    }
    public int calculate(Map<Integer,List<Node>> map, int curr, int dist, int n){
        boolean visited[] = new boolean[n];
        int minDist[] = new int[n];
        Arrays.fill(minDist,Integer.MAX_VALUE);
        Queue<Node> q = new LinkedList<>();
        q.add(new Node(curr,0));
        while(!q.isEmpty()){
            Node temp = q.poll();
            visited[temp.node] = true;
            List<Node> list = map.getOrDefault(temp.node,new ArrayList<>());
            for(Node i:list){
                if((!visited[i.node] || minDist[i.node]>temp.dist+i.dist) && temp.dist+i.dist<=dist) {
                    q.add(new Node(i.node,i.dist+temp.dist));
                    minDist[i.node] = temp.dist+i.dist;
                }
            }
        }
        int count =0;
        for(boolean i:visited) if(i) count++;
        return count-1;
    }
    public int findTheCity(int n, int[][] edges, int distanceThreshold) {
        Map<Integer,List<Node>> map = new HashMap<>();
        for(int i=0; i<edges.length; i++){
            List<Node> list1 = map.getOrDefault(edges[i][0],new ArrayList<>());
            list1.add(new Node(edges[i][1],edges[i][2]));
            List<Node> list2 = map.getOrDefault(edges[i][1],new ArrayList<>());
            list2.add(new Node(edges[i][0],edges[i][2]));
            map.put(edges[i][0],list1);
            map.put(edges[i][1],list2);
        }

        int res = Integer.MAX_VALUE;
        int min = Integer.MAX_VALUE;
        for(int i=0; i<n; i++){
            int count = calculate(map,i,distanceThreshold,n);
            System.out.println(count);
            if(count<=min) {
                min = count;
                res = i;
            }
        }
        return res;

    }
}