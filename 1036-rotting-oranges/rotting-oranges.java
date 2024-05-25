class Pair{
    int a;
    int b;
    Pair(int d1,int d2){
        a = d1;
        b = d2;
    }
}
class Solution {
    public int orangesRotting(int[][] grid) {
        Queue<Pair> q = new LinkedList<>();
        for(int i=0; i<grid.length; i++){
            for(int j=0; j<grid[0].length; j++){
                if(grid[i][j]==2) {
                    q.add(new Pair(i,j));
                }
            }
        }
        boolean flag = false;
        if(q.isEmpty()) flag = true;
        int res = 0;
        int r[] = {0,0,1,-1};
        int c[] = {1,-1,0,0};
        while(!q.isEmpty()){
            int size = q.size();
            for(int i=0; i<size; i++){
                Pair pair = q.poll();
                for(int k=0; k<4; k++){
                    int row = pair.a+r[k];
                    int col = pair.b+c[k];
                    if(row<grid.length && col<grid[0].length && row>=0 && col>=0 && grid[row][col]==1) {
                        q.add(new Pair(row,col));
                        grid[row][col]++;    
                    }
                }
            }
            res++;
        }
        for(int i=0; i<grid.length; i++){
            for(int j=0; j<grid[0].length; j++){
                if(grid[i][j]==1) {
                    return -1;
                }
            }
        }
        return flag?0:res-1;
    }
}