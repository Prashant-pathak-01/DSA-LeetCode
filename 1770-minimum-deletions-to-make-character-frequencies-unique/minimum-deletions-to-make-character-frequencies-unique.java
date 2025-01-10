class Solution {
    public int minDeletions(String s) {
        Map<Character,Integer> map = new HashMap<>();
        for(int i=0; i<s.length(); i++) map.put(s.charAt(i),map.getOrDefault(s.charAt(i),0)+1);
        Set<Integer> set = new HashSet<>();
        int res =0;
        for(char key:map.keySet()){
            int val = map.get(key);
            while(val>0 && set.contains(val)){
                res++;
                val--;
            }
            set.add(val);
        }
        return res;
    }
}