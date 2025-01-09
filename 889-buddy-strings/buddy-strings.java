class Solution {
    public boolean buddyStrings(String s, String goal) {
        if(s.length()!=goal.length()) return false;
        int count =0;
        int x = -1;
        for(int i=0; i<s.length(); i++){
            if(s.charAt(i)!=goal.charAt(i)){
                count++;
                if(x!=-1){
                    if(s.charAt(x)!=goal.charAt(i) || s.charAt(i)!=goal.charAt(x) ) return false;
                }else x = i;
            }
        }
        if(count==2) return true;
        else if(count==1 || count>2) return false;

        Map<Character,Integer> map = new HashMap<>();
        for(int i=0; i<s.length(); i++) map.put(s.charAt(i),map.getOrDefault(s.charAt(i),0)+1);
        for(char key:map.keySet()) if(map.get(key)>=2) return true;
        return false;
    }
}