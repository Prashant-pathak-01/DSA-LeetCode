class Solution {
    public int longestSubarray(int[] nums, int limit) {
        int left = 0, right = 0, n = nums.length, res = 0;
        Deque<Integer> min = new LinkedList<>();
        Deque<Integer> max = new LinkedList<>();
        while (right < n) {
            while (!min.isEmpty() && min.peekLast() > nums[right]) min.pollLast();
            min.addLast(nums[right]);

            while (!max.isEmpty() && max.peekLast() < nums[right]) max.pollLast();
            max.addLast(nums[right]);

            while (max.peekFirst() - min.peekFirst() > limit) {
                if (nums[left] == max.peekFirst()) max.pollFirst();
                if (nums[left] == min.peekFirst()) min.pollFirst();
                left++;
            }
            
            res = Math.max(res, right - left + 1);
            right++;
        }

        return res;
    }
}