class Solution {
    public void remove(int grid[][], int i, int j){
        if(i>=grid.length || i<0 || j>=grid[0].length || j<0 || grid[i][j]==0) return;
        grid[i][j] = 0;
        remove(grid,i+1,j);
        remove(grid,i-1,j);
        remove(grid,i,j+1);
        remove(grid,i,j-1);
    }
    public int numEnclaves(int[][] grid) {
        for(int i=0; i<grid[0].length; i++){
            remove(grid,0,i);
        }
        for(int i=0; i<grid[0].length; i++){
            remove(grid,grid.length-1,i);
        }
        for(int i=0; i<grid.length; i++){
            remove(grid,i,0);
        }
        for(int i=0; i<grid.length; i++){
            remove(grid,i,grid[0].length-1);
        }
        int count =0;
        for(int i=0; i<grid.length; i++){
            for(int j=0; j<grid[0].length; j++) if(grid[i][j]==1) count++;
            //System.out.println(Arrays.toString(grid[i]));
        }
        return count;
    }
}