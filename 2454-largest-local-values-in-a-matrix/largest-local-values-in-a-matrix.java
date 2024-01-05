class Solution {
    public int[][] largestLocal(int[][] grid) {
        int res[][] = new int[grid.length-2][grid.length-2];
        for(int i=1; i<grid.length-1; i++){
            for(int j=1; j<grid.length-1; j++){
                int temp = 0;
                for(int x=i-1; x<=i+1; x++ ){
                    for(int y= j-1; y<=j+1; y++ ){
                        temp = Math.max(grid[x][y],temp);
                    }
                }
                res[i-1][j-1] = temp;
            }
        }
        return res;
    }
}