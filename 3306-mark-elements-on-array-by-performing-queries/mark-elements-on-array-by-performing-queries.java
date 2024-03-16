class Solution {
        public long[] unmarkedSumArray(int[] nums, int[][] queries) {
        PriorityQueue<int[]> pq = new PriorityQueue<>((a, b) -> {
            if (a[0] != b[0]) {
                return a[0] - b[0];
            } else {
                return a[1] - b[1];
            }
        });

        long sum = 0;
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] > 0) {
                pq.offer(new int[]{nums[i], i});
                sum += nums[i];
            }
        }

        long[] answer = new long[queries.length];
        for (int i = 0; i < queries.length; i++) {
            if (nums[queries[i][0]] > 0) {
                sum -= nums[queries[i][0]];
                nums[queries[i][0]] = -1;
            }
            int x = 0;
            while (x < queries[i][1] && !pq.isEmpty()) {
                int[] entry = pq.poll();
                int value = entry[0];
                int idx = entry[1];
                if (nums[idx] > 0) {
                    sum -= value;
                    nums[idx] = -1;
                    x++;
                }
            }
            answer[i] = sum >= 0 ? sum : 0;
        }
        return answer;
    }
}
