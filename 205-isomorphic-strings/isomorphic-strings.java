class Solution {
    public boolean isIsomorphic(String s, String t) {
        if(s.length()!=t.length()) return false;
        Map<Character,Character> map = new HashMap<>();
        for(int i=0; i<s.length(); i++){
            if(map.containsKey(s.charAt(i))){
                if(t.charAt(i)!=map.get(s.charAt(i))) return false;
            }else{
                map.put(s.charAt(i),t.charAt(i));
            }
        }

        map.clear();

        for(int i=0; i<t.length(); i++){
            if(map.containsKey(t.charAt(i))){
                if(s.charAt(i)!=map.get(t.charAt(i))) return false;
            }else{
                map.put(t.charAt(i),s.charAt(i));
            }
        }

        return true;
    }
}