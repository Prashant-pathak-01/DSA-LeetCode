class Solution {
    public int[] restoreArray(int[][] adjacentPairs) {
        Map<Integer,List<Integer>> map = new HashMap<>();
        for(int[] i:adjacentPairs ){
            if(!map.containsKey(i[0])) map.put(i[0],new ArrayList<>());
            if(!map.containsKey(i[1])) map.put(i[1],new ArrayList<>());
            map.get(i[0]).add(i[1]);
            map.get(i[1]).add(i[0]);
        }
        int res[] = new int[adjacentPairs.length+1];
        for(var temp:map.entrySet()){
            if(temp.getValue().size()==1){
                res[0] = temp.getKey();
                res[1] = temp.getValue().get(0);
                break;
            }
        }

        for(int i=2; i<res.length; i++){
            res[i] = map.get(res[i-1]).get(0)==res[i-2]?map.get(res[i-1]).get(1):map.get(res[i-1]).get(0);
        }
        return res;
    }
}