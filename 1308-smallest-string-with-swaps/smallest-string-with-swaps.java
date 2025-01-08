class Solution {
    class Union{
        int parent[];
        Union(int n){
            parent = new int[n];
            for(int i=0; i<n; i++) parent[i] = i;
        }
        public int find(int x){
            if(parent[x]!=x) return parent[x] = find(parent[x]);
            else return x;
        }
        public void merge(int x, int y){
            int a = find(x);
            int b = find(y);
            if(a!=b){
                // System.out.println(a+" "+b);
                parent[b] = a;
            }
        }
        public void rootParent(){
            for(int i=0; i<parent.length; i++) {
                //System.out.println(i+" "+parent[i]);
                parent[i] = find(i);
            }
        }
        public int [] parent(){
            rootParent();
            return parent;
        }
    }
    public String smallestStringWithSwaps(String s, List<List<Integer>> pairs) {
        Union uf = new Union(s.length());
        for(int i=0; i<pairs.size(); i++){
            uf.merge(pairs.get(i).get(0),pairs.get(i).get(1));
        }
        int group[] = uf.parent();
        // System.out.print(Arrays.toString(group));
        Map<Integer,List<Character>> map = new HashMap<>();
        for(int i=0; i<group.length; i++){
            List<Character> list = map.getOrDefault(group[i],new ArrayList<>());
            list.add(s.charAt(i));
            map.put(group[i],list);
        }
        for(int key:map.keySet()){
            Collections.sort(map.get(key));
        }
        StringBuilder res = new StringBuilder();
        for(int i:group){
            List<Character> list = map.get(i);
            res.append(list.remove(0));
        }
        return res.toString();
    }
}