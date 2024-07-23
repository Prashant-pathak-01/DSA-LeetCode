class Solution {
    public int[] frequencySort(int[] nums) {
        PriorityQueue<int []> pq = new PriorityQueue<>((a,b)->b[1]==a[1]?b[0]-a[0]:a[1]-b[1]);
        Map<Integer,Integer> map = new HashMap<>();
        for(int i:nums) map.put(i, map.getOrDefault(i,0)+1);
        for(int key:map.keySet()){
            pq.add(new int[]{key,map.get(key)});
        }
        int i=0;
        while(!pq.isEmpty()){
            int temp [] = pq.poll();
            for(int x=0; x<temp[1]; x++){
                nums[i++] = temp[0];
            }
        }
        return nums;
    }
}