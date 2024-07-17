class Solution {
    public int countCompleteComponents(int n, int[][] edges) {
        List<List<Integer>> list = new ArrayList<>();
        for(int i=0; i<n; i++) list.add(new ArrayList<>());
        for(int i=0; i<edges.length; i++){
            list.get(edges[i][0]).add(edges[i][1]);
            list.get(edges[i][1]).add(edges[i][0]);
        }
        boolean visited[] = new boolean[n];
        int res= 0;
        System.out.println(list);
        for(int i=0; i<n; i++){
            if(!visited[i]){
                Queue<Integer> q = new LinkedList<>();
                q.add(i);
                visited[i] = true;
                int size = list.get(i).size()+1;
                int count = 1;
                boolean complete = true;
                while(!q.isEmpty()){
                    int temp = q.poll();
                    for(int x:list.get(temp)){
                        if(!visited[x]){
                            count++;
                            if(list.get(x).size()+1!=size) complete = false;
                            q.add(x);
                            visited[x] = true;
                        }
                    }
                }
                if(size!=count) complete = false;
                if(complete) res++;
            }
        }
        return res;
    }
}