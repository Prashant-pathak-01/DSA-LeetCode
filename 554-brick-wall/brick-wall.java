class Solution {
    public int leastBricks(List<List<Integer>> wall) {
        Map<Integer,Integer> map = new HashMap<>();
        for(int i=0; i<wall.size(); i++){
            int sum =0;
            for(int j=0; j<wall.get(i).size()-1; j++){
                sum+=wall.get(i).get(j);
                map.put(sum,map.getOrDefault(sum,0)+1);
            }
        }
        int res=  wall.size();
        for(int key:map.keySet()){
            res = Math.min(res,wall.size()-map.get(key));
        }
        return res;
    }
}