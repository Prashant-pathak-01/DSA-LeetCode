class Solution {
    public boolean canBeEqual(int[] target, int[] arr) {
        if(arr.length!=target.length) return false; 

        Map<Integer,Integer> map = new HashMap<>();
        for(int i:arr) {
            if(map.containsKey(i)){
                map.put(i,map.get(i)+1);
            }else{
                map.put(i,1);
            }
        }
        for(int i:target) if(!map.containsKey(i)) return false; else {
            if(map.get(i)>0) map.put(i,map.get(i)-1);
            else return false;
        }
        return true;
    }
}