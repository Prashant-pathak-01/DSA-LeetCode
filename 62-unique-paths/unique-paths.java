class Solution {
    public int paths(int m,int n, int count, int [][]dp) {
        if(m==1 && n==1) return 1;
        if(m==0 || n==0) return 0;
        if(dp[m-1][n-1]!=0) return dp[m-1][n-1];
        return dp[m-1][n-1] = paths(m-1,n,count,dp)+paths(m,n-1,count,dp);
    }
    public int uniquePaths(int m, int n) {
        int count = 0;
        int dp[][] = new int[m][n];
        return paths(m,n,count,dp);
    }
}