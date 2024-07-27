class Solution {
    public int secondMinimum(int n, int[][] edges, int time, int change) {
        List<List<Integer>> list = new ArrayList<>();
        for(int i=0; i<=n; i++){
            list.add(new ArrayList<>());
        }
        for(int i=0; i<edges.length; i++){
            list.get(edges[i][0]).add(edges[i][1]);
            list.get(edges[i][1]).add(edges[i][0]);
        }
        int dist1[] = new int[n+1];
        int dist2[] = new int[n+1];
        int freq[] = new int[n+1];
        Arrays.fill(dist1,Integer.MAX_VALUE);
        Arrays.fill(dist2,Integer.MAX_VALUE);

        PriorityQueue<int []> pq = new PriorityQueue<>((a,b)->a[1]-b[1]);
        pq.add(new int[]{1,0});
        while(!pq.isEmpty()){
            int temp[] = pq.poll();
            freq[temp[0]]++;
            if(freq[temp[0]]==2 && temp[0]==n) return temp[1];
            if((temp[1]/change)%2==1) temp[1]= change*(temp[1]/change+1)+time;
            else temp[1] = temp[1]+time;
            for(int x:list.get(temp[0])){
                if(freq[x]==2) continue;
                if(dist1[x]>temp[1]) {
                    dist2[x] = dist1[x];
                    dist1[x] = temp[1];
                    pq.add(new int[]{x,temp[1]});
                }else if(dist2[x]>temp[1] && dist1[x]!=temp[1]){
                    dist2[x] = temp[1];
                    pq.add(new int[]{x,temp[1]});
                }
           }
        }
        return 0;
    }
}