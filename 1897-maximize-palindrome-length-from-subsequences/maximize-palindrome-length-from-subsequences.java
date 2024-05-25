class Solution {
    int result = 0;
    public int solve(String str, int i, int n,int lim1,int dp[][]){
        if(i==n) return 1;
        if(i>n) return 0;
        if(dp[i][n]!=-1) return dp[i][n];
        int res = 0;
        if(str.charAt(i)==str.charAt(n)){
            res = 2+solve(str,i+1,n-1,lim1,dp);
            if(i<lim1 && n>=lim1) result = Math.max(result,res);
        }else {
            res = Math.max(solve(str,i+1,n,lim1,dp),solve(str,i,n-1,lim1,dp));
        }
        return dp[i][n] = res;
    }
    public int longestPalindrome(String word1, String word2) {
        int dp[][] = new int[word1.length()+word2.length()][word1.length()+word2.length()];
        for(int i=0; i<word1.length()+word2.length(); i++) Arrays.fill(dp[i],-1);
        solve(word1+word2,0,word1.length()+word2.length()-1,word1.length(),dp);
        return result;
    }
}