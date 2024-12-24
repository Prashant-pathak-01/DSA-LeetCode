class Solution {
    public boolean check(char grid[][], int i, int j, boolean visited[][], int pi, int pj){
        if(visited[i][j]) return true;
        visited[i][j] = true;
        boolean res= false;
        if(i<grid.length-1 && (pi!=i+1 || pj!=j) && grid[i][j]==grid[i+1][j]) res = res || check(grid,i+1,j,visited,i,j);
        if(j<grid[0].length-1 && (pi!=i || pj!=j+1) && grid[i][j]==grid[i][j+1]) res = res || check(grid,i,j+1,visited,i,j);
        if(i>0 && (pi!=i-1 || pj!=j) && grid[i][j]==grid[i-1][j]) res = res || check(grid,i-1,j,visited,i,j);
        if(j>0 && (pi!=i || pj!=j-1) && grid[i][j]==grid[i][j-1]) res = res || check(grid,i,j-1,visited,i,j);
        return res;
    }
    public boolean containsCycle(char[][] grid) {
        boolean visited[][] = new boolean[grid.length][grid[0].length];
        for(int i=0; i<grid.length; i++){
            for(int j=0; j<grid[0].length; j++){
                if(!visited[i][j] && check(grid,i,j,visited,-1,-1)) return true;
            }
        }
        return false;
    }
}