class Solution {
    public String longestPalindrome(String s) {
        if(s.length()==0 || s.length()==1) return s;
        int res = 0;
        String rester = "";
        int dp[][] = new int[s.length()][s.length()];
        for(int i=0; i<s.length(); i++) Arrays.fill(dp[i],-1);
        for(int i=0; i<s.length(); i++){
            for(int j=i; j<s.length(); j++){
                if(j-i+1>res && isPalindrome(s,i,j,dp)){
                    res = j-i+1;
                    rester = s.substring(i,j+1);
                }
            }
        }
        return rester;
    }
    public Boolean isPalindrome(String s,int i,int j,int [][]dp){
        if(i>=j) return true;
        if(dp[i][j]!=-1) return dp[i][j]==1;
        if(s.charAt(i)!=s.charAt(j)) {
            dp[i][j] = 0;
            return dp[i][j]==1;
        }
        dp[i][j] = isPalindrome(s,i+1,j-1,dp)?1:0;
        return dp[i][j]==1;
    }
}