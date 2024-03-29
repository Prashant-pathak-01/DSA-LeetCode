class Solution {
    public int numSplits(String s) {
        Map<Character,Integer> map = new HashMap<>();
        Set<Character> set = new HashSet<>();
        for(int i=0; i<s.length(); i++){
            map.put(s.charAt(i),map.getOrDefault(s.charAt(i),0)+1);
        }
        int res =0;
        for(int i=0; i<s.length(); i++){
            map.put(s.charAt(i),map.get(s.charAt(i))-1);
            if(map.get(s.charAt(i))==0) map.remove(s.charAt(i));
            set.add(s.charAt(i));
            if(set.size()==map.size()) res++;
        }
        return res;
    }
}