class Solution {
    public boolean isPalindrome(String str,int i, int j,int dp[][]){
        if(i>=j) return true;
        if(dp[i][j]!=-1) return dp[i][j]==1;
        if(str.charAt(i)!=str.charAt(j)){
            dp[i][j] = 0;
            return false;
        }
        dp[i][j] = isPalindrome(str,i+1,j-1,dp)?1:0;
        return dp[i][j]==1;
    }
    public String longestPalindrome(String s) {
        int prev = 0;
        String res = "";
        int dp[][] = new int[s.length()][s.length()];
        for(int i[]:dp) Arrays.fill(i,-1);
        for(int i=0; i<s.length(); i++){
            for(int j=i; j<s.length(); j++){
                if(j-i+1>prev && isPalindrome(s,i,j,dp)) {
                    prev = j-i+1;
                    res = s.substring(i,j+1);
                }
            }
        }
        return res;
    }
}