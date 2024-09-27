class Solution {
    
    public int minRefuelStops(int target, int startFuel, int[][] stations) {
        PriorityQueue<Integer> pq = new PriorityQueue<>((a,b)->b-a);
        int res= 0;
        for(int i=0; i<stations.length && startFuel<target; i++){
            while(startFuel<stations[i][0]){
                res++;
                if(pq.isEmpty()) return -1;
                startFuel+=pq.poll();
            }
            pq.add(stations[i][1]);
        }
        while(!pq.isEmpty() && startFuel<target){
            startFuel+=pq.poll();
            res++;
        }
        return target>startFuel?-1:res;
    }
}