class Solution {
    public int orangesRotting(int[][] grid) {
        Queue<int []> q = new LinkedList<>();
        for(int i=0; i<grid.length; i++){
            for(int j=0; j<grid[0].length; j++){
                if(grid[i][j]==2) q.add(new int[]{i,j});
            }
        }
        int res=0;
        int r[] = {-1,1,0,0};
        int c[] = {0,0,-1,1};
        while(!q.isEmpty()){
            int size = q.size();
            for(int i=0; i<size; i++){
                int temp[] = q.poll();
                for(int j=0; j<4; j++){
                    int row = temp[0]+r[j];
                    int col = temp[1]+c[j];
                    if(row>=0 && row<grid.length && col>=0 && col<grid[0].length && grid[row][col]==1 ){
                        q.add(new int[]{row,col});
                        grid[row][col]++;
                    }
                }
            }
            res++;
        }
        for(int i=0; i<grid.length; i++){
            for(int j=0; j<grid[0].length; j++){
                if(grid[i][j]==1) return -1;
            }
        }
        return res>0?res-1:0;
    }
}