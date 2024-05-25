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
        while(!q.isEmpty()){
            int size = q.size();
            for(int i=0; i<size; i++){
                Pair pair = q.poll();
                if(pair.a<grid.length-1 && grid[pair.a+1][pair.b]==1) {
                    q.add(new Pair(pair.a+1,pair.b));
                    grid[pair.a+1][pair.b]++;    
                }
                if(pair.b<grid[0].length-1 && grid[pair.a][pair.b+1]==1) {
                    q.add(new Pair(pair.a,pair.b+1));
                    grid[pair.a][pair.b+1]++;    

                }
                if(pair.a>=1 && grid[pair.a-1][pair.b]==1){
                    q.add(new Pair(pair.a-1,pair.b));
                    grid[pair.a-1][pair.b]++;    

                }
                if(pair.b>=1 && grid[pair.a][pair.b-1]==1){
                    q.add(new Pair(pair.a,pair.b-1));
                    grid[pair.a][pair.b-1]++;    
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