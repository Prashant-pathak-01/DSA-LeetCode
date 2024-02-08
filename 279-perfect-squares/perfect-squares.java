class Solution {
    public int generateSquares(int n, int dp[]){
        if(n<4) return n;
        if(dp[n]!=0) return dp[n];
        int res = n;
        for(int i=1; i*i<=n; i++){
            res = Math.min(res,1+generateSquares(n-(i*i),dp));
        }
        return dp[n] = res;
    }
    public int numSquares(int n) {
        int dp[] = new int[n+1];
        return generateSquares(n,dp);
    }
}