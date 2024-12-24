class Solution {
    class Union{
        int parent[];
        int size[];
        Union(int n){
            parent  = new int[n];
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

        public void merge(int x, int y){
            int a = find(x);
            int b = find(y);
            if(a!=b){
                if(size[a]>size[b]){
                    parent[b] = a;
                    size[a]+=size[b];
                }else{
                    parent[a] = b;
                    size[b]+=size[a];
                }
            }
        }


    }
    public boolean[] friendRequests(int n, int[][] restrictions, int[][] requests) {
        boolean res[] = new boolean[requests.length];
        Union uf = new Union(n);
        for(int i=0; i<requests.length; i++){
            boolean flag = true;
            int pi = uf.find(requests[i][0]);
            int pj = uf.find(requests[i][1]);
            for(int j=0; j<restrictions.length; j++){
                int px = uf.find(restrictions[j][0]);
                int py = uf.find(restrictions[j][1]);
                if((px==pi && py==pj) || (px==pj && py==pi)) {
                    flag = false;
                    break;    
                }
            }
            if(flag) {
                res[i] = true;
                uf.merge(requests[i][0],requests[i][1]);
            }
        }
        return res;
    }
}