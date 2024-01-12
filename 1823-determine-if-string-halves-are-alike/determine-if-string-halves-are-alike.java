class Solution {
    public boolean halvesAreAlike(String s) {
        int h1 = 0;
        int h2 = 0;
        for(int i=0; i<s.length()/2; i++){
            if(s.charAt(i)=='a' || s.charAt(i)=='e' || s.charAt(i)=='i' || s.charAt(i)=='o' || s.charAt(i)=='u' || s.charAt(i)=='A' || s.charAt(i)=='E' || s.charAt(i)=='I' || s.charAt(i)=='O' || s.charAt(i)=='U' ) h1++;
            if(s.charAt((s.length()/2)+i)=='a' || s.charAt((s.length()/2)+i)=='e' || s.charAt((s.length()/2)+i)=='i' || s.charAt((s.length()/2)+i)=='o' || s.charAt((s.length()/2)+i)=='u' || s.charAt((s.length()/2)+i)=='A' || s.charAt((s.length()/2)+i)=='E' || s.charAt((s.length()/2)+i)=='I' || s.charAt((s.length()/2)+i)=='O' || s.charAt((s.length()/2)+i)=='U' ) h2++;
        }
        return h1==h2;
    }
}