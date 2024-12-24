class Solution {
    class Union{
        int parent[];
        int size[];
        Union(int n){
            parent = new int[n];
            size = new int[n];
            for(int i=0; i<n; i++){
                parent[i] = i;
                size[i] = 1;
            }
        }

        public int find(int x){
            if(parent[x]!=x) return parent[x] = find(parent[x]);
            return parent[x];
        }
        public void merge(int a, int b){
            int x = find(a);
            int y = find(b);
            if(x!=y){
                if(size[x]>size[y]){
                    parent[y]=x;
                    size[x]+=size[y];
                }else{
                    parent[x] = y;
                    size[y]+=size[x];
                }
            }
        }
    }
    public int minScore(int n, int[][] roads) {
        Map<Integer,List<Integer>> map = new HashMap<>();
        Union uf = new Union(n);
        for(int i=0; i<roads.length; i++){
            List<Integer> list = map.getOrDefault(roads[i][0]-1,new ArrayList<>());
            list.add(roads[i][2]);
            map.put(roads[i][0]-1,list);
            uf.merge(roads[i][0]-1,roads[i][1]-1);
        }
        int mainParent = uf.find(0);
        int res = Integer.MAX_VALUE;
        for(int i=0; i<n; i++){
            int parent = uf.find(i);
            if(parent==mainParent){
                for(int x:map.getOrDefault(i,new ArrayList<>())) res = Math.min(res,x);
            }

        }
        return res;
    }
}