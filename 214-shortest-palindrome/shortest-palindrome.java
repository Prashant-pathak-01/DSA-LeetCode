class Solution {
    public boolean isPal(String s, int i, int j){
        while(i<j){
            if(s.charAt(i)!=s.charAt(j)) return false;
            i++;
            j--;
        }
        return true;
    }
    public String shortestPalindrome(String s) {
        int i =0 ;
       for(i=s.length()-1; i>=0 ; i--){
           if(isPal(s.substring(0,i+1),0,i)) break;
       }
       StringBuilder temp = new StringBuilder(s.substring(i+1));
       temp.reverse();
       return temp+s;
    }
}