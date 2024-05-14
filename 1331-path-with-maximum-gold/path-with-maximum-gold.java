class Solution {
    public int generate(int grid[][], int i, int j){
        if(i>=grid.length || j>=grid[0].length || i<0 || j<0 || grid[i][j]==0) return 0;
        int temp = grid[i][j];
        grid[i][j] = 0;
        int res = 0;
        res = Math.max(res,temp+generate(grid,i+1,j));
        res = Math.max(res,temp+generate(grid,i-1,j));
        res = Math.max(res,temp+generate(grid,i,j+1));
        res = Math.max(res,temp+generate(grid,i,j-1));
        grid[i][j] = temp;
        return res;
    }
    public int getMaximumGold(int[][] grid) {
        int res = 0;
        for(int i=0; i<grid.length; i++){
            for(int j=0; j<grid[0].length; j++){
                res = Math.max(res,generate(grid,i,j));
            }
        }
        return res;
    }
}