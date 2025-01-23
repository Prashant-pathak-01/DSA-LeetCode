class Solution {
    class Pair{
        int i;
        int j;
        int count;
        Pair(int i, int j, int count){
            this.i = i;
            this.j = j;
            this.count = count;
        }
    }
    public int[][] highestPeak(int[][] isWater) {
        int res[][] = new int[isWater.length][isWater[0].length];
        for(int i=0; i<isWater.length; i++) Arrays.fill(res[i],Integer.MAX_VALUE);
        PriorityQueue<Pair> pq = new PriorityQueue<>((a,b)->a.count-b.count);
        boolean isVisited[][] = new boolean[isWater.length][isWater[0].length];
        int r[] = new int[]{1,-1,0,0};
        int c[] = new int[]{0,0,1,-1};
        for(int i=0; i<isWater.length; i++){
            for(int j=0; j<isWater[i].length; j++){
                if(isWater[i][j]==1){
                    res[i][j] =0;
                    pq.add(new Pair(i,j,0));
                }
            }
        }
        while(!pq.isEmpty()){
            Pair temp = pq.poll();
            res[temp.i][temp.j] = temp.count;
            for(int x=0; x<4; x++){
                if(temp.i+r[x]>=0 && temp.i+r[x]<isWater.length && temp.j+c[x]>=0 && temp.j+c[x]<isWater[0].length && !isVisited[temp.i+r[x]][temp.j+c[x]] && temp.count+1<res[temp.i+r[x]][temp.j+c[x]]){
                    isVisited[temp.i+r[x]][temp.j+c[x]] = true;
                    pq.add(new Pair(temp.i+r[x],temp.j+c[x],temp.count+1));
                }
            }
        }
        return res;
    }
}