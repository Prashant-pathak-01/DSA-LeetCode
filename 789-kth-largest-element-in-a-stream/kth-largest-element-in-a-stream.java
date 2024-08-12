class KthLargest {
    PriorityQueue<Integer> pq = new PriorityQueue<>((a,b)->b-a);
    PriorityQueue<Integer> storage = new PriorityQueue<>((a,b)->a-b);
    public KthLargest(int k, int[] nums) {
        Arrays.sort(nums);
        if(k<=nums.length){
            for(int i=nums.length-1; i>nums.length-k; i--) storage.add(nums[i]);
            for(int i=nums.length-k; i>=0; i--) pq.add(nums[i]);
        }else{
            for(int i=0; i<nums.length; i++) storage.add(nums[i]);
        }
    }
    
    public int add(int val) {
        if(!pq.isEmpty() && val<=pq.peek()) return pq.peek();
        storage.add(val);
        int temp = storage.poll();
        pq.add(temp);
        return temp;
    }
}
