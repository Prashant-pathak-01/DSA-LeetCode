class Solution {
    class Union{
        int parent[];
        int size[];
        Union(int n){
            parent = new int[n];
            size = new int[n];
            for(int i=0; i<n; i++) {
                parent[i] = i;
                size[i] = 1;
            }
        }
        public int find(int x){
            if(parent[x]!=x) return parent[x] = find(parent[x]);
            else return x;
        }
        public void merge(int x, int y){
            int a = find(x);
            int b = find(y);
            if(a!=b){
                if(size[a]>size[b]){
                    parent[b] = a;
                    size[a]+=size[b];
                }else {
                    parent[a] = b;
                    size[b]+=size[a];
                }
            }
        }
        public void rootParent(){
            for(int i=0; i<parent.length; i++) {
                parent[i] = find(i);
            }
        }
        public Map<Integer,Integer> mapping(){
            Map<Integer,Integer> map = new HashMap<>();
            for(int i=0; i<parent.length; i++){
                int parent = find(i);
                map.put(parent,size[parent]);
            }
            return map;
        }
    }
    public long countPairs(int n, int[][] edges) {
        Union  uf = new Union(n);
        for(int i=0; i<edges.length; i++){
            uf.merge(edges[i][0],edges[i][1]);
        }
        Map<Integer,Integer> map = uf.mapping();
        long res = 0l;
        for(int key:map.keySet()){
            res+=((long)map.get(key)*(n-map.get(key)));
        }
        return res/2;
    }
}