class Solution {
    public boolean check(int grid[][], int i, int j){
        if(i<0 || j<0 || i>=grid.length || j>=grid[0].length) return false;
        if(grid[i][j]==1) return true;
        grid[i][j] = 1;
        boolean res = true;
        res = check(grid,i+1,j) && res;
        res = check(grid,i-1,j) && res;
        res = check(grid,i,j+1) && res;
        res = check(grid,i,j-1) && res;
        return res;
    } 
    public int closedIsland(int[][] grid) {
        int res = 0;
        for(int i=0; i<grid.length; i++){
            for(int j=0; j<grid[0].length; j++){
                if(grid[i][j]==0){
                    if(check(grid,i,j)) res++;
                }
            }
        }
        return res;
    }
}