class Solution {
    public boolean isPalindrome(String str){
        int i=0;
        int j= str.length()-1;
        while(i<j){
            if(str.charAt(i++)!=str.charAt(j--)) return false;
        }
        return true;
    }
    public int countSubstrings(String s) {
        int res = 0;
        for(int i=0; i<s.length(); i++){
            for(int j=i; j<s.length(); j++){
                if(isPalindrome(s.substring(i,j+1))) res++;
            }
        }
        return res;
    }
}