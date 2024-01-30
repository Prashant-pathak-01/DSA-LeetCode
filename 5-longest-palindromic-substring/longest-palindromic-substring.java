class Solution {
    public boolean isPalindrome(String str){
        int i=0; 
        int j= str.length()-1;
        while(i<j) if(str.charAt(i++)!=str.charAt(j--)) return false;
        return true;
    }
    public String longestPalindrome(String s) {
        int prev = 0;
        String res = "";
        for(int i=0; i<s.length(); i++){
            for(int j=i; j<s.length(); j++){
                if(j-i+1>prev && isPalindrome(s.substring(i,j+1))) {
                    prev = j-i+1;
                    res = s.substring(i,j+1);
                }
            }
        }
        return res;
    }
}