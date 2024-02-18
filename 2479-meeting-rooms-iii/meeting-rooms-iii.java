class Solution {
    public int mostBooked(int n, int[][] meetings) {
        long []available = new long[n];
        int []meeting = new int[n];
        Arrays.sort(meetings,(a,b)->Integer.compare(a[0], b[0]));
        for(int i=0; i<meetings.length; i++){
            boolean Nfound = true;
            long minWaitingTime = Long.MAX_VALUE;
            int minWaitingRoom = 0;

            for(int j=0; j<n; j++){
                if(available[j]<=meetings[i][0]){
                    meeting[j]++;
                    available[j] = meetings[i][1];
                    Nfound = false;
                    break;
                }
                if(minWaitingTime>available[j]){
                    minWaitingTime = available[j];
                    minWaitingRoom = j;
                }
            }
            if(Nfound){
                available[minWaitingRoom] = available[minWaitingRoom]+meetings[i][1]-meetings[i][0];
                meeting[minWaitingRoom]++;
            }
        }
        int max =0;
        int res = 0;
        for(int i=0; i<n; i++){
            if(max<meeting[i]){
                max = meeting[i];
                res = i;
            }
        }
        return res;

    }
}