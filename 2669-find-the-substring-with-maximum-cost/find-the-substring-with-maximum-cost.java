class Solution {
    public int maximumCostSubstring(String s, String chars, int[] vals) {
        Map<Character,Integer> map = new HashMap<>();
        for(int i=0; i<chars.length(); i++){
            map.put(chars.charAt(i),vals[i]);
        }
        int max = 0;
        int res  = 0;
        for(int i=0; i<s.length(); i++){
            max+=map.getOrDefault(s.charAt(i),s.charAt(i)-'a'+1);
            if(max<0) max=  0;
            res = Math.max(res,max);
        }
        return res;
    }
}