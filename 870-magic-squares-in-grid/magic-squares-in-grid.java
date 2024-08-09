class Solution {
    public boolean isValid(int grid[][], int i, int j){
        int arr[] = new int[10];
        for(int x=i; x<i+3; x++) if(grid[x][j]<=9) arr[grid[x][j]]++;
        for(int x=i; x<i+3; x++) if(grid[x][j+1]<=9) arr[grid[x][j+1]]++;
        for(int x=i; x<i+3; x++) if(grid[x][j+2]<=9) arr[grid[x][j+2]]++;
        for(int x=1; x<=9; x++) if(arr[x]!=1) return false;
        return true;
    }
    public int numMagicSquaresInside(int[][] grid) {
        int res= 0 ;
        if(grid.length<3 || grid[0].length<3) return 0;
        for(int i=0; i<grid.length-2; i++){
            for(int j=0; j<grid[0].length-2; j++){
                if(isValid(grid,i,j)){
                    int r1 = grid[i][j]+grid[i][j+1]+grid[i][j+2];
                    int r2 =  grid[i+1][j]+grid[i+1][j+1]+grid[i+1][j+2];
                    int r3 =  grid[i+2][j]+grid[i+2][j+1]+grid[i+2][j+2];
                    int c1 =  grid[i][j]+grid[i+1][j]+grid[i+2][j];
                    int c2 =  grid[i][j+1]+grid[i+1][j+1]+grid[i+2][j+1];
                    int c3 =  grid[i][j+2]+grid[i+1][j+2]+grid[i+2][j+2];
                    int d1 =  grid[i][j]+grid[i+1][j+1]+grid[i+2][j+2];
                    int d2 =  grid[i][j+2]+grid[i+1][j+1]+grid[i+2][j];
                    if(r1==r2 && r2==r3 && r3==c1 && r3==c2 && r3==d1 && d2==d2) res++;
                }
                    
            }
        }
        return res;
    }
}