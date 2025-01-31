class Solution {
    public boolean isPalindrome(String str, int i, int j, int dp[][]){
        if(i>=j) return true;
        if(dp[i][j]!=0) return dp[i][j]==1;
        if(str.charAt(i)==str.charAt(j)){
            boolean check = isPalindrome(str,i+1,j-1,dp);
            dp[i][j] = check?1:0;
            return check; 
        }else{
            dp[i][j] = 0;
            return false;
        }
    }
    public String longestPalindrome(String s) {
        int dp[][] = new int[s.length()][s.length()];
        String res ="";
        for(int i=0; i<s.length(); i++){
            for(int j=i; j<s.length(); j++){
                if(j-i+1>res.length() && isPalindrome(s,i,j,dp)) res = s.substring(i,j+1);
            }
        }
        return res;
    }
}