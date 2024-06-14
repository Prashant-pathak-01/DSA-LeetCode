class Solution {
    public int maximumProduct(int[] nums, int k) {
        PriorityQueue<Integer> pq =  new PriorityQueue<>();
        for(int i:nums) pq.add(i);
        for(int i=0; i<k; i++){
            pq.add(pq.poll()+1);
        }
        long res =1;
        int mod = (int)1e9+7;
        while(!pq.isEmpty()){
            res = (res*pq.poll())%mod;
        }
        return (int)res;
    }
}