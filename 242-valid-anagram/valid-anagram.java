class Solution {
    public boolean isAnagram(String s, String t) {
        if(s.length()!=t.length()) return false;
        Map<Character, Integer> map = new HashMap<>();
        for(int i=0; i<s.length(); i++){
            char sChar = s.charAt(i);
            if(map.containsKey(sChar)){
                map.put(sChar,map.get(sChar)+1);
            }else{
                map.put(sChar,1);
            }
        }
        for(int i=0; i<t.length(); i++){
            char tChar = t.charAt(i);
            if(map.containsKey(tChar)){
                if(map.get(tChar)==0) return false;
                map.put(tChar,map.get(tChar)-1);
            }else return false;
        }
        return true;
    }
}