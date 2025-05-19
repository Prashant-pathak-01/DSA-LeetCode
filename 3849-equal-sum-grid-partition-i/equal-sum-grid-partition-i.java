class Solution {
    public boolean canPartitionGrid(int[][] grid) {
        long row[] = new long[grid.length];
        long col[] = new long[grid[0].length];
        long sum =0;
        for(int i=0; i<grid.length; i++){
            for(int j=0; j<grid[0].length; j++){
                sum+=grid[i][j];
            }
            row[i] = sum;
        }
        sum =0;
        for(int i=0; i<grid[0].length; i++){
            for(int j=0; j<grid.length; j++){
                sum+=grid[j][i];
            }
            col[i] = sum;
        }
        for(int i=0; i<row.length-1; i++){
            if(row[i]*2==row[row.length-1]) return true;
        }
        for(int i=0; i<col.length-1; i++){
            if(col[i]*2==col[col.length-1]) return true;
        }
        return false;
    }
}