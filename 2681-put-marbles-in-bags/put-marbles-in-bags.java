class Solution {
    public long putMarbles(int[] weights, int k) {
        PriorityQueue<Long> pq = new PriorityQueue<>(); 
        for(int i=0; i<weights.length-1; i++){
            pq.add((long)weights[i]+weights[i+1]);
        }
        long max =0;
        long min =0;
        k--;
        int c =k;
        while(!pq.isEmpty()){
            long temp = pq.poll();
            if(k>0){
                min+=temp;
                k--;
            }
            if(pq.size()<c){
                max+=temp;
            }
        }
        return max-min;

    }
}