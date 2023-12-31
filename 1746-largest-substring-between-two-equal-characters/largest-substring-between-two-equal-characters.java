class Solution {
    public int maxLengthBetweenEqualCharacters(String s) {
        int res = -1;
        Map<Character,Integer> map = new HashMap<>();
        for(int i=0; i<s.length(); i++){
            if(map.containsKey(s.charAt(i))){
                res = Math.max(res,i-1-map.get(s.charAt(i)));
            }else{
                map.put(s.charAt(i),i);
            }
        }
        return res;
    }
}