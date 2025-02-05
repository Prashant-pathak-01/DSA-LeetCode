class Solution {
    public boolean areAlmostEqual(String s1, String s2) {
        if(s1.length()!=s2.length()) return false;
        int count =0;
        int prev = -1;
        for(int i=0; i<s1.length(); i++){
            if(s1.charAt(i)!=s2.charAt(i)){
                count++;
                if(count==2){
                    if(s1.charAt(i)!=s2.charAt(prev) || s1.charAt(prev)!=s2.charAt(i)) return false;
                }
                prev = i;
            }
            if(count>2) return false;
            
        }
        return count!=1;
    }
}