class Solution {
    public int[] sortJumbled(int[] mapping, int[] nums) {
        PriorityQueue<long []> pq  = new PriorityQueue<>((a, b) ->a[1]!=b[1]?Long.compare(a[1], b[1]):Long.compare(a[2], b[2]));
        for(int i=0; i<nums.length; i++){
            long number = 0;
            String temp = String.valueOf(nums[i]);
            for(int x=0; x<temp.length(); x++){
                number = number*10;
                number+=mapping[(int)(temp.charAt(x)-'0')];
            }
            pq.add(new long[]{nums[i],number,i});
        }
        int i = 0;
        while(!pq.isEmpty()){
            nums[i++]= (int)pq.poll()[0];
        }
        return nums;
    }
}