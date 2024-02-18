class Solution {
    int MOD = (int)1e9+7;
    public long generateSoln(int grid[][], int i, int j, int prev, long dp[][]){
        if( i>=grid.length || j>=grid[0].length || i<0 || j<0 || grid[i][j]<=prev ) return 0;
        if(dp[i][j]!=0) return dp[i][j];
        long count = 1;
        count=(count+generateSoln(grid,i,j+1,grid[i][j],dp))%MOD;
        count=(count+generateSoln(grid,i,j-1,grid[i][j],dp))%MOD;
        count=(count+generateSoln(grid,i+1,j,grid[i][j],dp))%MOD;
        count=(count+generateSoln(grid,i-1,j,grid[i][j],dp))%MOD;
        return dp[i][j] = count%MOD;

    }
    public int countPaths(int[][] grid) {
        long res = 0;
        long dp[][] = new long[grid.length][grid[0].length];
        for(int i=0; i<grid.length; i++){
            for(int j=0; j<grid[0].length; j++){
                res = (res+generateSoln(grid,i,j,Integer.MIN_VALUE,dp))%MOD;
            }
        }
        return (int)res%MOD;
    }
}