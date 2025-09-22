class Solution {
    public int maxFrequencyElements(int[] nums) {
        Map<Integer,Integer> map = new HashMap<>();
        for(int i:nums) map.put(i,map.getOrDefault(i,0)+1);
        int max = 0;
        int count =0;
        for(int i:map.keySet()){
            if(map.get(i)>=max) {
                if(map.get(i)>max) count =0;
                max = map.get(i);
                count++;
            }
        }
        return max*count;
    }
}