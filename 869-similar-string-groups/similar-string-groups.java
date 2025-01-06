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
            else return parent[x];
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
        public int countGroups(){
            Set<Integer> set = new HashSet<>();
            for(int i=0; i<parent.length; i++) {
                parent[i] = find(parent[i]);
                set.add(find(parent[i]));
            }
            return set.size();
        }
    }

    public boolean matching(String []str, int i, int j){
        int count =0;
        for(int x=0; x<str[i].length(); x++){
            if(str[i].charAt(x)!=str[j].charAt(x)) count++;
        }
        return count==0 || count==2;
    }
    public int numSimilarGroups(String[] strs) {
        Union uf = new Union(strs.length);
        for(int i=0; i<strs.length; i++){
            for(int j=0; j<strs.length; j++){
                if(i!=j && matching(strs,i,j)){
                    uf.merge(i,j);
                }
            }
        }
        // System.out.println(Arrays.toString(uf.parent));
        return uf.countGroups();
    }
}