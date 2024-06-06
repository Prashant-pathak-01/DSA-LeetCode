class Solution {
    public boolean isPossibleDivide(int[] nums, int k) {
        Map<Integer,Integer> map = new HashMap<>();
        for(int i:nums) map.put(i,map.getOrDefault(i,0)+1);
        Arrays.sort(nums);
        for(int i:nums){
            if(map.containsKey(i)){
                int temp = map.get(i);
                for(int j=i; j<i+k; j++){
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