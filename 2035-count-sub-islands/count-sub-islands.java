class Solution {
    public boolean check(int grid1[][], int grid2[][], int i, int j){
        if(i>=grid1.length || i<0 || j<0 || j>=grid1[0].length || grid2[i][j]==0) return true;
        if(grid1[i][j]!=grid2[i][j]) return false;
        grid2[i][j] = 0;
        boolean res = true;
        res = res&check(grid1,grid2,i+1,j);
        res = res&check(grid1,grid2,i-1,j);
        res = res&check(grid1,grid2,i,j-1);
        res = res&check(grid1,grid2,i,j+1);
        return res;
    }
    public int countSubIslands(int[][] grid1, int[][] grid2) {
        int res= 0;
        for(int i=0; i<grid2.length; i++){
            for(int j=0; j<grid2[0].length; j++){
                if(grid2[i][j]==1 && check(grid1,grid2,i,j)) res++;
            }
        }
        return res;
    }
}