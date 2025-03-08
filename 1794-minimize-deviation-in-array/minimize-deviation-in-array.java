class Solution {
    public int minimumDeviation(int[] nums) {
        int min = Integer.MAX_VALUE;
        PriorityQueue<Integer> pq = new PriorityQueue<>((a,b)->b-a);
        for(int i:nums) {
            int temp = i%2==0?i:i*2;
            pq.add(temp);
            min = Math.min(min,temp);
        }

        int res = Integer.MAX_VALUE;
        while(!pq.isEmpty() && pq.peek()%2==0){
            int temp = pq.poll()/2;
            res = Math.min(res,(temp*2)-min);
            if(temp<min) min = temp;
            pq.add(temp);
        }
        res = Math.min(res,pq.peek()-min);
        return res;
        
    }
}