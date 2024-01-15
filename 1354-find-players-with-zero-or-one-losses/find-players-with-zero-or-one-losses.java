class Solution {
    public List<List<Integer>> findWinners(int[][] matches) {
        Map<Integer,Integer> map = new HashMap<>();
        for(int i=0; i<matches.length; i++){
            if(!map.containsKey(matches[i][0])) map.put(matches[i][0],0);
            map.put(matches[i][1],map.getOrDefault(matches[i][1],0)+1);
        }
        List<List<Integer>> list = new ArrayList<>();
        List<Integer> temp1 = new ArrayList<>();
        List<Integer> temp2 = new ArrayList<>();
        for(Map.Entry<Integer,Integer> key:map.entrySet()){
            if(key.getValue()==0) temp1.add(key.getKey());
            if(key.getValue()==1) temp2.add(key.getKey());
        }
        Collections.sort(temp1);
        Collections.sort(temp2);
        list.add(new ArrayList<>(temp1));
        list.add(new ArrayList<>(temp2));
        
        return list;

    }
}