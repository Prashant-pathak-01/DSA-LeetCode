class Solution {
    class Pair{
        int x;
        int y;
        int count;
        Pair(int x, int y, int count){
            this.x = x;
            this.y = y;
            this.count = count;
        }
    }
    public int minimumObstacles(int[][] grid) {
        PriorityQueue<Pair> pq = new PriorityQueue<>((a,b)->a.count-b.count);
        pq.add(new Pair(0,0,0));
        int r[] = new int[]{1,-1,0,0};
        int c[] = new int[]{0,0,1,-1};
        boolean visited[][] = new boolean[grid.length][grid[0].length];
        while(!pq.isEmpty()){
            Pair temp = pq.poll();
            if(temp.x==grid.length-1 && temp.y==grid[0].length-1) return temp.count;
            for(int i=0; i<4; i++){
                if(temp.x+r[i]>=0 && temp.x+r[i]<grid.length && temp.y+c[i]>=0 && temp.y+c[i]<grid[0].length && !visited[temp.x+r[i]][temp.y+c[i]]){
                    if(grid[temp.x+r[i]][temp.y+c[i]]==0) pq.add(new Pair(temp.x+r[i],temp.y+c[i],temp.count));
                    else  pq.add(new Pair(temp.x+r[i],temp.y+c[i],temp.count+1));
                    visited[temp.x+r[i]][temp.y+c[i]] = true;
                }
            }

        }
        return 0;
    }
}