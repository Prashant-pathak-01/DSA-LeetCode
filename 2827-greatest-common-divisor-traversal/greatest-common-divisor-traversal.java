class Solution {
    public void genFactors(int n, int indx, Map<Integer,List<Integer>> map){
        if(n%2==0){
            map.put(2,map.getOrDefault(2,new ArrayList<>()));
            map.get(2).add(indx);
        }
        while(n%2==0) n/=2;
        for(int x =3; x<=Math.sqrt(n); x+=2){
            while(n%x==0){
                map.put(x,map.getOrDefault(x,new ArrayList<>()));
                map.get(x).add(indx);
                n/=x;
            }
        }
        if(n!=1){
            map.put(n,map.getOrDefault(n,new ArrayList<>()));
            map.get(n).add(indx);
        }
    }
    public void dfs(ArrayList<ArrayList<Integer>>graph,boolean []vis,int indx){
        vis[indx]=true;
        for(int i:graph.get(indx)){
            if(!vis[i]){
                dfs(graph,vis,i);
            }
        }
    }

    public boolean canTraverseAllPairs(int[] nums) {
        Map<Integer,List<Integer>> map = new HashMap<>();
        for(int i=0; i<nums.length; i++){
            genFactors(nums[i],i,map);
        }

        ArrayList<ArrayList<Integer>>graph=new ArrayList<>();
        int n=nums.length;
        for(int i=0;i<n;i++){
            graph.add(new ArrayList<>());
        }  
        for(List<Integer>temp:map.values()){
            for(int i=1;i<temp.size();i++){
                graph.get(temp.get(i-1)).add(temp.get(i));
                graph.get(temp.get(i)).add(temp.get(i-1));
            }
        }
        boolean visited[] = new boolean[nums.length];
        
        dfs(graph,visited,0);

        for(boolean i:visited) if(!i) return false;
        return true;
    }
}