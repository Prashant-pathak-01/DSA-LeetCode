import java.util.PriorityQueue;

class Solution {
    public int minOperations(int[] nums, int k) {
        PriorityQueue<Long> pq = new PriorityQueue<>();
        for (int num : nums) {
            pq.offer((long)num);
        }
        
        int operations = 0;
        while (!pq.isEmpty() && pq.peek() < k) {
            if (pq.size() < 2) {
                break;
            }
            long x = pq.poll();
            long y = pq.poll();
            long newValue = Math.min(x, y) * 2 + Math.max(x, y);
            pq.offer(newValue);
            operations++;
        }
        
        return operations;
    }
}
