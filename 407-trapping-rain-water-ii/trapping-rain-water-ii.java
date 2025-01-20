class Solution {
    class Pair{
        int i;
        int j;
        int h;
        Pair(int i, int j, int h){
            this.i = i;
            this.j = j;
            this.h = h;
        }
    }
    public int trapRainWater(int[][] heightMap) {
        boolean visited[][] = new boolean[heightMap.length][heightMap[0].length];
        PriorityQueue<Pair> pq = new PriorityQueue<>((a,b)->a.h-b.h);
        for(int i=0; i<heightMap.length; i++){
            visited[i][0] = true;
            visited[i][visited[i].length-1] = true;
            pq.add(new Pair(i,0,heightMap[i][0]));
            pq.add(new Pair(i,visited[i].length-1,heightMap[i][visited[i].length-1]));
        }
        for(int i=0; i<heightMap[0].length; i++){
            visited[0][i] = true;
            visited[visited.length-1][i] = true;
            pq.add(new Pair(0,i,heightMap[0][i]));
            pq.add(new Pair(visited.length-1,i,heightMap[visited.length-1][i]));
        }
        int res =0;
        int r[] = new int[]{1,-1,0,0};
        int c[] = new int[]{0,0,1,-1};
        while(!pq.isEmpty()){
            Pair temp = pq.poll();
            for(int i=0; i<4; i++){
                int newI = temp.i+r[i];
                int newJ = temp.j+c[i];
                if(newI>=0 && newI<heightMap.length && newJ>=0 && newJ<heightMap[0].length && !visited[newI][newJ]){
                    pq.add(new Pair(newI,newJ,Math.max(heightMap[newI][newJ],temp.h)));
                    res+=Math.max(0,temp.h-heightMap[newI][newJ]);
                    visited[newI][newJ] = true;
                }
            }
        }
        return res;
    }
}