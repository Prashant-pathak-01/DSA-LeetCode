class Solution {
    public int minSteps(String s, String t) {
        Map<Character,Integer> map = new HashMap<>();
        for(int i=0; i<s.length(); i++) map.put(s.charAt(i),map.getOrDefault(s.charAt(i),0)+1);
        int res =0;
        for(int i=0; i<t.length(); i++){
            if(map.containsKey(t.charAt(i))){
                map.put(t.charAt(i),map.get(t.charAt(i))-1);
                if(map.get(t.charAt(i))==0) map.remove(t.charAt(i));
            }else{
                res++;
            }
        }
        return res;
    }
}