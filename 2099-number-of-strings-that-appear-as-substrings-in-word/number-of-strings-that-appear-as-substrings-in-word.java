class Solution {
    public boolean isSubstr(String a, String b){
        if(a.length()>b.length()) return false;
        for(int i=0; i<b.length()-a.length()+1; i++){
            if(b.substring(i,i+a.length()).equals(a)) return true;
        }
        return false;
    }
    public int numOfStrings(String[] patterns, String word) {
        int res= 0;
        for(int i=0; i<patterns.length; i++) if(isSubstr(patterns[i],word)) res++;
        return res;
    }
}