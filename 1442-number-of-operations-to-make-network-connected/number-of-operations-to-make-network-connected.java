class Solution {
    class Union{
        int parent[];
        int size[];
        Union(int n){
            parent = new int[n];
            size = new int[n];
            for(int i=0; i<n; i++) {
                size[i] = 1;
                parent[i] = i;
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
                    parent[y] = x; 
                    size[x]++;
                }else {
                    parent[x] = y;
                    size[y]++;
                }
            }
        }
        public int groups(){
            Set<Integer> set = new HashSet<>();
            for(int i=0; i<parent.length; i++) {
                set.add(find(i));
            }
            //System.out.println(Arrays.toString(parent));
            return set.size();

        }
    }
    public int makeConnected(int n, int[][] connections) {
        if(n-1>connections.length) return -1;
        Union uf = new Union(n);
        int res= 0 ;
        for(int i=0; i<connections.length; i++){
            uf.merge(connections[i][0],connections[i][1]);
        }

        return uf.groups()-1;
    }
}