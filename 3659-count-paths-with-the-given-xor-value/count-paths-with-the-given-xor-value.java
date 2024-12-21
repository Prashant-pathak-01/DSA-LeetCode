class Solution {
    int MOD = (int)1e9+7;
    public int countPathsWithXorValue(int[][] grid, int k) {
        int m = grid.length;
        int n = grid[0].length;
        int[][][] dp = new int[m][n][16];
        dp[0][0][grid[0][0]] = 1;
        for(int i=0; i<m; i++) {
            for(int j=0; j<n; j++) {
                for(int temp = 0; temp<16; temp++) {
                    if(dp[i][j][temp]>0) {
                        if(j+1<n) {
                            dp[i][j+1][temp^grid[i][j+1]] = 
                                (dp[i][j+1][temp^grid[i][j+1]]+dp[i][j][temp])%MOD;
                        }
                        if(i+1<m) {
                            dp[i+1][j][temp^grid[i+1][j]] = 
                                (dp[i+1][j][temp^grid[i+1][j]]+dp[i][j][temp])%MOD;
                        }
                    }
                }
            }
        }
        return dp[m-1][n-1][k];
    }
}
