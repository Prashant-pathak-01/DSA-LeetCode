class Solution {
    public int eliminateMaximum(int[] dist, int[] speed) {
        for(int i=0; i<dist.length; i++){
            dist[i] = (dist[i]%speed[i]==0)?dist[i]/speed[i]:(dist[i]/speed[i])+1;
        }
        Arrays.sort(dist);
        int res = 0;
        for(int i=0; i<dist.length; i++){
            if(dist[i]>i) res++;
            else break;
        }
        return res;
    }
}