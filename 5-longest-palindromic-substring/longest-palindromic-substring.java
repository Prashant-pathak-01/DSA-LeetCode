class Solution {
    public String longestPalindrome(String s) {
        if(s.length()==0 || s.length()==1) return s;
        int res = 0;
        String rester = "";
        for(int i=0; i<s.length(); i++){
            for(int j=i; j<s.length(); j++){
                if(j-i+1>res && isPalindrome(s.substring(i,j+1))){
                    res = j-i+1;
                    rester = s.substring(i,j+1);
                }
            }
        }
        return rester;
    }
    public Boolean isPalindrome(String s){
        int i = 0;
        int j = s.length()-1;
        while(i<j){
            if(s.charAt(i)==s.charAt(j)){
                i++; 
                j--;
            }else return false;
        }
        return true;
    }
}