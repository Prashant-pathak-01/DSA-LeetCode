class Solution {
    public int edgeScore(int[] edges) {
        Map<Integer,Long> map = new HashMap<>();
        for(int i=0; i<edges.length; i++){
            map.put(edges[i],map.getOrDefault(edges[i],0l)+i);
        }
        int res =Integer.MAX_VALUE;
        for(int key:map.keySet()){
            if(map.get(key)>=map.getOrDefault(res,0l)){
                // System.out.println(map.getOrDefault(res,0l)+" "+map.get(key));
                if((long)map.get(key)==map.getOrDefault(res,0l)) {
                    res = Math.min(res,key);
                }
                else res = key;
            }
        }
        return res;
    }
}