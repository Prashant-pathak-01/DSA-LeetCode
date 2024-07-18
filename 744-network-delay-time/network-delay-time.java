class Solution {
    public int networkDelayTime(int[][] times, int n, int k) {
        List<List<int []>> list = new ArrayList<>();
        for(int i=0; i<=n; i++) list.add(new ArrayList<>());
        for(int i=0; i<times.length; i++){
            list.get(times[i][0]).add(new int[]{times[i][1],times[i][2]});
        }
        int finalTime[] = new int[n+1];
        Arrays.fill(finalTime,Integer.MAX_VALUE);
        Queue<int []> q = new LinkedList<>();
        q.add(new int[]{k,0});
        finalTime[k] = 0;
        while(!q.isEmpty()){
            int size = q.size();
            for(int i=0; i<size; i++){
                int temp[] = q.poll();
                for(int[] x:list.get(temp[0])){
                    int min = temp[1]+x[1];
                    if(min<finalTime[x[0]]){
                        finalTime[x[0]] = min;
                        q.add(new int[]{x[0],min});
                    }
                }
            }
        }
        int res= -1;
        System.out.println(Arrays.toString(finalTime));
        for(int x=1; x<finalTime.length; x++){
            if(finalTime[x]==Integer.MAX_VALUE) return -1;
            res = Math.max(res,finalTime[x]);
        }
        return res;
    }
}