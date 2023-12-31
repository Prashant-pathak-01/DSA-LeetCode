class Solution {
    public char findTheDifference(String s, String t) {
        Map<Character,Integer> map = new HashMap<>();
        for(int i=0; i<s.length(); i++){
            if(map.containsKey(s.charAt(i))){
                map.put(s.charAt(i),map.get(s.charAt(i))+1);
            } else{
                map.put(s.charAt(i),1);
            }
        }
        for(int i=0; i<t.length(); i++){
            if(map.containsKey(t.charAt(i))){
                if(map.get(t.charAt(i))==0) return t.charAt(i);
                map.put(t.charAt(i),map.get(t.charAt(i))-1);
                
            } else return t.charAt(i);
        }
        return '0';
    }
}