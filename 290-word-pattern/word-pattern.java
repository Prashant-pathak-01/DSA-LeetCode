class Solution {
    public boolean wordPattern(String pattern, String s) {
        Map<Character,String> map1 = new HashMap<>();
        Map<String,Character> map2 = new HashMap<>();
        List<String> list = new ArrayList<>();
        StringBuilder temp = new StringBuilder();
        for(int i=0; i<s.length(); i++){
            if(s.charAt(i)==' '){
                list.add(temp.toString());
                temp.setLength(0);
            }else{
                temp.append(s.charAt(i));
            }
        }
        if(temp.length()!=0) list.add(temp.toString());
        if(list.size()!=pattern.length()) return false;
        for(int i=0; i<pattern.length(); i++){
            if(map1.containsKey(pattern.charAt(i))){
                if(!map1.get(pattern.charAt(i)).equals(list.get(i))) return false;
            }else{
                map1.put(pattern.charAt(i),list.get(i));
            }
        }
        for(int i=0; i<pattern.length(); i++){
            if(map2.containsKey(list.get(i))){
                if(map2.get(list.get(i))!=pattern.charAt(i)) return false;
            }else{
                map2.put(list.get(i),pattern.charAt(i));
            }
        }
        return true;
        
    }
}