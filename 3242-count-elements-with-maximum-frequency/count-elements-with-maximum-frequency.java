class Solution {
    public int maxFrequencyElements(int[] nums) {
        Map<Integer,Integer> map = new HashMap<>();
        int res =0 ;
        for(int i:nums) map.put(i,map.getOrDefault(i,0)+1);
        List<Integer> list = new ArrayList<>(map.values());
        Collections.sort(list);
        res+=list.get(list.size()-1);
        for(int i=list.size()-1; i>=1; i--) {
            if(list.get(i)==list.get(i-1)) res+=list.get(i); 
            else break;
        }
        return res;
        
    }
}