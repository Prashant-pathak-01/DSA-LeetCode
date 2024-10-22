class Solution {
    public int numberOfSubstrings(String str, int k) {
        int res =0;
        Map<Character,Integer> map = new HashMap<>();
        int j =0;
        for(int i=0; i<str.length(); i++){
            map.put(str.charAt(i),map.getOrDefault(str.charAt(i),0)+1);
            while(map.get(str.charAt(i))>=k) {
                res+=(str.length()-i);
                map.put(str.charAt(j),map.getOrDefault(str.charAt(j),0)-1);
                j++;
            }
        }
        return res;
    }
}