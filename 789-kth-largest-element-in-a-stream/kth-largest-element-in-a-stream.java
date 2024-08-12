class KthLargest {
    int max = Integer.MAX_VALUE;
    PriorityQueue<Integer> storage = new PriorityQueue<>((a,b)->a-b);
    public KthLargest(int k, int[] nums) {
        Arrays.sort(nums);
        if(k<=nums.length){
            for(int i=nums.length-1; i>nums.length-k; i--) storage.add(nums[i]);
            max = nums[nums.length-k];
        }else{
            for(int i=0; i<nums.length; i++) storage.add(nums[i]);
        }
    }
    
    public int add(int val) {
        if(max!=Integer.MAX_VALUE && val<=max) return max;
        storage.add(val);
        int temp = storage.poll();
        max = temp;
        return temp;
    }
}
