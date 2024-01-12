class Solution {
    public boolean halvesAreAlike(String s) {
        Set<Character> set = new HashSet<>(Set.of('a','e','i','o','u','A','E','I','O','U'));
        int h1 = 0;
        int h2 =0;
        for(int i=0; i<s.length()/2; i++){
            if(set.contains(s.charAt(i))) h1++;
            if(set.contains(s.charAt((s.length()/2)+i))) h2++;
            
        }
        
        return h1==h2;
    }
}