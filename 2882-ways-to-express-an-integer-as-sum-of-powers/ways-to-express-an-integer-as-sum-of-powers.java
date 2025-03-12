class Solution {
    int MOD = (int)1e9+7;
    public int solve(int n, int x, int i, int dp[][]){
        if(n==0) return 1;
        if(n<0) return 0;
        if(i>n) return 0;
        if(dp[i][n]!=-1) return dp[i][n];
        int take = solve(n-(int)Math.pow(i,x),x,i+1,dp);
        int nottake = solve(n,x,i+1,dp);
        return dp[i][n] = (take+nottake)%MOD;
    }
    public int numberOfWays(int n, int x) {
        int dp[][] = new int[n+1][n+1];
        for(int i=0; i<n+1; i++){
            Arrays.fill(dp[i],-1);
        }
        return solve(n,x,1,dp);
    }
}