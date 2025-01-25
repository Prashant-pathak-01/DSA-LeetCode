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
            else return x; 
        }
        public void merge(int a, int b){
            int x = find(a);
            int y = find(b);
            if(a!=b){
                if(size[x]>=size[y]){
                    parent[y] = x;
                    size[x]+=size[y];
                }else{
                    parent[x]  = y;
                    size[y]+=size[x];
                }
            }
        }
    }

    class Pair{
        int i;
        int val;
        Pair(int i,int val){
            this.i = i;
            this.val = val;
        }
    }
    public int[] lexicographicallySmallestArray(int[] nums, int limit) {
        Pair temp[] = new Pair[nums.length];
        for(int i=0; i<nums.length; i++){
            temp[i] = new Pair(i,nums[i]);
        }
        Arrays.sort(temp,(a,b)->a.val-b.val);
        Union  uf = new Union(nums.length);
        for(int i=1; i<nums.length; i++){
            if(temp[i].val-temp[i-1].val<=limit) uf.merge(temp[i-1].i,temp[i].i);
        } 
        HashMap<Integer,PriorityQueue<Integer>> map = new HashMap<>();
        for(int i=0; i<nums.length; i++){
            int parent = uf.parent[i];
            PriorityQueue<Integer> pq = map.getOrDefault(parent,new PriorityQueue<>());
            pq.add(nums[i]);
            map.put(parent,pq);
        }
        int res[] = new int[nums.length];
        for(int i=0;i<nums.length; i++){
            int parent = uf.parent[i];
            res[i] = map.get(parent).poll();
        }
        return res;
    }
}