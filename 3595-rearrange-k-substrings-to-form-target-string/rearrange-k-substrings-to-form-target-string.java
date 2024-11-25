class Solution {
    public boolean isPossibleToRearrange(String s, String t, int k) {
        Map<String,Integer> map = new HashMap<>();
        int temp = s.length()/k;
        for(int i=0; i<s.length(); i+=temp){
            map.put(s.substring(i,i+temp),map.getOrDefault(s.substring(i,i+temp),0)+1);
        }
        for(int i=0; i<t.length(); i+=temp){
            if(map.containsKey(t.substring(i,i+temp))){
                map.put(t.substring(i,i+temp),map.getOrDefault(t.substring(i,i+temp),0)-1);
                if(map.get(t.substring(i,i+temp))==0) map.remove(t.substring(i,i+temp));
            }else return false;
        }
        return true;
    }
}