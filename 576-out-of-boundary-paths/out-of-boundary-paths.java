class Solution {
    int MOD = (int)1e9+7;
    public long findAllPaths(int m,int n, int moves, int s, int e,long dp[][][]){
        if(moves<0) return 0;
        if(s>=m || e>=n || s<0 || e<0) return 1;
        if(dp[s][e][moves]!=-1) return dp[s][e][moves];
        long left = findAllPaths(m,n,moves-1,s-1,e,dp)%MOD;
        long right = findAllPaths(m,n,moves-1,s+1,e,dp)%MOD;
        long top = findAllPaths(m,n,moves-1,s,e-1,dp)%MOD;
        long bottom = findAllPaths(m,n,moves-1,s,e+1,dp)%MOD;
        return dp[s][e][moves] = (left+right+top+bottom)%MOD;

    }
    public int findPaths(int m, int n, int maxMove, int startRow, int startColumn) {
        long arr[][][] = new long[m][n][52];
        for(long[][] i:arr)
        for(long[] j:i) Arrays.fill(j,-1);
        return (int)findAllPaths(m,n,maxMove,startRow,startColumn,arr)%MOD;
    }
}