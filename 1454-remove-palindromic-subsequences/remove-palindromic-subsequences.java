class Solution {
    public boolean isPal(String s){
        int i =0;
        int j = s.length()-1;
        while(i<j) if(s.charAt(i++)!=s.charAt(j--)) return false;
        return true;
    }
    public int removePalindromeSub(String s) {
        if(isPal(s)) return 1;
        return 2; 
    }
}