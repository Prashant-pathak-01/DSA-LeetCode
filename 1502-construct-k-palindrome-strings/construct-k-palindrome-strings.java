class Solution {
    public boolean canConstruct(String s, int k) {
        if(s.length()<k) return false;
        Map<Character,Integer> map = new HashMap<>();
        for(int i=0; i<s.length(); i++){
            map.put(s.charAt(i),map.getOrDefault(s.charAt(i),0)+1);
        }
        int count =0;
        for(char key:map.keySet()){
            if(map.get(key)%2==1) count++;
        }
        if(count>k) return false;
        return true;
    }
}