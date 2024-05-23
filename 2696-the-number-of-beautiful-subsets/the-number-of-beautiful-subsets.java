class Solution {
    public int solve(int[] nums, int idx, int k, HashMap<Integer, Integer> map) {
        if (idx == nums.length) return 1;

        int taken = 0;
        if (!map.containsKey(nums[idx] - k) && !map.containsKey(nums[idx] + k)) {
            map.put(nums[idx], map.getOrDefault(nums[idx], 0) + 1);
            taken = solve(nums, idx + 1, k, map);
            map.put(nums[idx], map.get(nums[idx]) - 1);
            if (map.get(nums[idx]) == 0) {
                map.remove(nums[idx]);
            }
        }
        int notTaken = solve(nums, idx + 1, k, map);
        return taken + notTaken;
    }

    public int beautifulSubsets(int[] nums, int k) {
        HashMap<Integer, Integer> map = new HashMap<>();
        int ans = solve(nums, 0, k, map);
        return ans - 1;
    }
}