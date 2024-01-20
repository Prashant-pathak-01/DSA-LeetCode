class Solution {
    public int maxFrequencyElements(int[] nums) {
        int maxFreq = 0;

        Map<Integer,Integer> map = new HashMap<>();
        for(int i:nums) {
            map.put(i,map.getOrDefault(i,0)+1);
            maxFreq = Math.max(maxFreq,map.get(i));
        }
        int res = 0;
        for(Map.Entry<Integer,Integer> key:map.entrySet()){
            if(key.getValue()==maxFreq) res+=maxFreq;
        }
        return res;
    }
}