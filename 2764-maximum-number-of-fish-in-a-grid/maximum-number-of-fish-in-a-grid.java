class Solution {
    public int solve(int grid[][], int i, int j){
        if(i>=grid.length || j>=grid[0].length || i<0 || j<0 || grid[i][j]==0) return 0;
        int res = grid[i][j];
        int r[]= {-1,1,0,0};
        int c[]= {0,0,1,-1};
        grid[i][j] =0 ;
        for(int x=0; x<4; x++){
            res+=solve(grid,i+r[x],j+c[x]);
        }
        return res;

    }
    public int findMaxFish(int[][] grid) {
        int res= 0;
        for(int i=0; i<grid.length; i++){
            for(int j=0; j<grid[0].length; j++){
                if(grid[i][j]!=0){
                    res = Math.max(res,solve(grid,i,j));
                }
            }
        }
        return res;
    }
}