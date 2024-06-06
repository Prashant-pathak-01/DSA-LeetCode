class Solution {
    public boolean isNStraightHand(int[] hand, int groupSize) {
        Map<Integer,Integer> map = new HashMap<>();
        for(int i:hand) map.put(i,map.getOrDefault(i,0)+1);
        Arrays.sort(hand);
        for(int i:hand){
            if(map.containsKey(i)){
                int temp = map.get(i);
                for(int j=i; j<i+groupSize; j++){
                    if(map.containsKey(j) && map.get(j)>=temp ){
                        map.put(j,map.get(j)-temp);
                        if(map.get(j)==0) map.remove(j);
                    }else return false;
                }
            }
        }
        return true;
    }
}