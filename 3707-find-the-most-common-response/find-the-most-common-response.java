class Solution {
    public String findCommonResponse(List<List<String>> responses) {
        Map<String,Integer> map = new HashMap<>();
        for(int i=0; i<responses.size(); i++){
            Set<String> set = new HashSet<>();
            for(String j: responses.get(i)){
                if(!set.contains(j)) map.put(j,map.getOrDefault(j,0)+1);
                set.add(j);
            }
        }
        String res = "";
        int max = -1;
        for(String key:map.keySet()){
            if(map.get(key)>=max){
                if(map.get(key)>max){
                    max = map.get(key);
                    res = key;
                }else {
                    if(res.compareTo(key)>0) res = key;
                }
            }
        }
        return res;
    }
}