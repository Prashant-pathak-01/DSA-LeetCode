class Solution {
    public int longestConsecutive(int[] nums) {
        Map<Integer,Boolean> map = new HashMap<>();
        for(int i:nums) {
            if(!map.containsKey(i-1)){
                map.put(i,true);
            }else {
                map.put(i,false);
            }
            if(map.containsKey(i+1)) {
                    map.put(i+1,false);
                }
        }
        int res =0;
        for(int i:map.keySet()){
            if(map.get(i)){
                int count =1;
                int temp = i+1;
                while(map.containsKey(temp)){
                    count++;
                    temp++;
                }
                res = Math.max(res,count);
            }
        }
        return res;
    }
}