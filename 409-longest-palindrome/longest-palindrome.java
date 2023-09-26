class Solution {
    public int longestPalindrome(String s) {
        Map<Character, Integer> map = new HashMap<>();
        for(int i=0; i<s.length(); i++){
            if(map.containsKey(s.charAt(i))){
                map.put(s.charAt(i),map.get(s.charAt(i))+1);
            } else{
                map.put(s.charAt(i),1);
            }
        }
        int count = 0;
        for(int i=0; i<s.length(); i++){
            if(map.containsKey(s.charAt(i)) && map.get(s.charAt(i))%2!=0) {
                map.remove(s.charAt(i));
                count++;
                }
        }

        if(count==0 || count == 1) return s.length();
        return s.length()-count+1;
    }
}