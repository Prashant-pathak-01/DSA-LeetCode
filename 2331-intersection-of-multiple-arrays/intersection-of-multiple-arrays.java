class Solution {
    public List<Integer> intersection(int[][] nums) {
        Map<Integer,Integer> map = new HashMap<>();
        for(int i[]:nums) for(int j:i) map.put(j,map.getOrDefault(j,0)+1);
        List<Integer> res=  new ArrayList<>();
        for(int key:map.keySet()) if(map.get(key)==nums.length) res.add(key);
        Collections.sort(res);
        return res;
    }
}