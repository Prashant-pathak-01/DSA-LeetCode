class Solution {
    public int func(int [][]grid, int i,int j){
        if(i<0 || j<0 || i>=grid.length || j>=grid[0].length || grid[i][j]==0) return 0;
        grid[i][j]=0;
        return 1+func(grid,i+1,j)+func(grid,i-1,j)+func(grid,i,j+1)+func(grid,i,j-1);
    }
    public int maxAreaOfIsland(int[][] grid) {
        int res = 0;
        for(int i=0; i<grid.length; i++){
            for(int j=0; j<grid[0].length; j++){
                if(grid[i][j]==1){
                    res = Math.max(res,func(grid,i,j));
                }
            }
        }
        return res;
    }
}