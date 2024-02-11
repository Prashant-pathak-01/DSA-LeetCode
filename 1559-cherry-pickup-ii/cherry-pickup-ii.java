class Solution {
    public int generateRes(int grid[][], int i,int jA, int jB, int n, int m, int dp[][][]){
        if(jA<0 || jB<0 || jA>=m || jB>=m) return 0;
        if(i==n) return 0;
        int res = 0;
        if(dp[i][jA][jB]!=-1) return dp[i][jA][jB];
        res=grid[i][jA]+grid[i][jB];
        int next = 0;
        for(int x=-1; x<=1; x++){
            for(int y=-1; y<=1; y++){
                if(jA+x<jB+y){
                    next = Math.max(next,generateRes(grid,i+1,jA+x,jB+y,n,m,dp));
                }
            }
        }
        return dp[i][jA][jB] = res+next;
    }
    public int cherryPickup(int[][] grid) {
        int dp[][][] = new int[grid.length][grid[0].length][grid[0].length];
        for(int i[][]:dp) for(int j[]:i) Arrays.fill(j,-1);
        int res = 0;
        res+=generateRes(grid,0,0,grid[0].length-1,grid.length,grid[0].length,dp);
        return res;

    }
}