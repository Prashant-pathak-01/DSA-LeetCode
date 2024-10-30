class Solution {
    public int solve(int grid[][], int i, int j, int dp[][]){
        if(i>=grid.length || i<0 || j>=grid[0].length-1) return 0;
        if(dp[i][j]!=-1) return dp[i][j];
        int a = 0;
        if(grid[i][j]<grid[i][j+1]) a = 1+solve(grid,i,j+1,dp);
        int b = 0;
        if(i>0 && grid[i][j]<grid[i-1][j+1]) b = 1+solve(grid,i-1,j+1,dp);
        int c = 0;
        if(i<grid.length-1 && grid[i][j]<grid[i+1][j+1]) c = 1+solve(grid,i+1,j+1,dp);
        return dp[i][j] = Math.max(a,Math.max(b,c));
    }
    public int maxMoves(int[][] grid) {
        int res =0;
        int dp[][] = new int[grid.length][grid[0].length];
        for(int i[]:dp) Arrays.fill(i,-1);
        for(int i=0; i<grid.length; i++){
            res = Math.max(res,solve(grid,i,0,dp));
        }
        return res;
    }
}