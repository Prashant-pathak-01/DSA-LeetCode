class Solution {
    public long putMarbles(int[] weights, int k) {
        PriorityQueue<Long> pqMin = new PriorityQueue<>(); 
        PriorityQueue<Long> pqMax = new PriorityQueue<>(Collections.reverseOrder()); 
        for(int i=0; i<weights.length-1; i++){
            pqMin.add((long)weights[i]+weights[i+1]);
            pqMax.add((long)weights[i]+weights[i+1]);
            if(pqMin.size()>=k) {
                pqMin.poll();
                pqMax.poll();
            }
        }
        long min =0;
        long max =0;
        
        while(!pqMin.isEmpty()){
            max+=pqMin.poll();
            min+=pqMax.poll();

        }
        return max-min;

    }
}