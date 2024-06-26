import java.math.BigInteger;
class Solution {
    public String kthLargestNumber(String[] nums, int k) {
        PriorityQueue<BigInteger> pq = new PriorityQueue<>(Comparator.reverseOrder());
        for(int i=0; i<nums.length; i++){
            pq.add(new BigInteger(nums[i]));
        }
        for(int i=0; i<k-1; i++){
            pq.poll();
        }
        return String.valueOf(pq.poll());
    }
}