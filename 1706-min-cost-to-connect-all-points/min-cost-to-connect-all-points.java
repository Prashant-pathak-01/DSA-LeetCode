class Solution {
    int parent[];
    public int find(int x){
        if(parent[x]==x) return x;
        return find(parent[x]);
    }
    public void join(int x, int y){
        int a = find(x);
        int b = find(y);
        parent[a] = b;
    }
    public int minCostConnectPoints(int[][] points) {
        parent = new int[points.length];
        for(int i=0; i<points.length; i++) parent[i] = i;
        PriorityQueue<int []> pq = new PriorityQueue<>((a,b)->a[0]-b[0]);
        for(int i=0; i<points.length-1; i++){
            for(int j=i+1; j<points.length; j++){
                pq.add(new int[]{Math.abs(points[i][0]-points[j][0])+Math.abs(points[i][1]-points[j][1]),i,j});
            }
        }
        int count = 1;
        int res = 0;
        while(count<points.length){
            int temp[] = pq.poll();
            int a = find(temp[1]);
            int b = find(temp[2]);
            if(a!=b){
                count++;
                res+=temp[0];
                join(temp[1],temp[2]);
            }

        }

        return res;

    }
}