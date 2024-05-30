class Solution {
    public boolean solve(int grid[][], int i, int j, int max,boolean flag[][]){
        if(i>=grid.length || j>=grid[0].length || i<0 || j<0 || flag[i][j] || grid[i][j]>max) return false;
        if(i==grid.length-1 && j==grid[0].length-1) return true;
        flag[i][j] = true;
        if(solve(grid,i,j+1,max,flag)) return true;
        if(solve(grid,i,j-1,max,flag)) return true;
        if(solve(grid,i+1,j,max,flag)) return true;
        if(solve(grid,i-1,j,max,flag)) return true;
        return false;
    }
    public int swimInWater(int[][] grid) {
        for(int i=0; i<grid[0].length*grid[0].length; i++) {
            if(solve(grid,0,0,i,new boolean[grid.length][grid[0].length])) return i;
        } 
        return 0;

    }
}