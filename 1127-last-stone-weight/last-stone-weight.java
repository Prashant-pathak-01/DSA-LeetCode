class Solution {
    public int lastStoneWeight(int[] stones) {
        PriorityQueue<Integer> pq = new PriorityQueue<>((a,b)->b-a);
        for(int i=0; i<stones.length; i++) pq.add(stones[i]);
        while(pq.size()>1){
            int a = pq.poll();
            int b = pq.poll();
            if(a>b) pq.add(a-b);
            else if(b>a) pq.add(b-a);
        }
        return !pq.isEmpty()?pq.poll():0;
    }
}