class Solution {
    public boolean isPalindrome(String str){
        int i=0; 
        int j = str.length()-1;
        while(i<j){
            if(str.charAt(i++)!=str.charAt(j--)) return false;
        }
        return true;
    }
    public boolean validPalindrome(String s) {
        int i=0; int j = s.length()-1; 
        while(i<j){
            if(s.charAt(i)==s.charAt(j)){
                i++;
                j--;
            }else {
                return isPalindrome(s.substring(i+1,j+1)) || isPalindrome(s.substring(i,j));
            }
        }
        return true;
    }
}