class Solution {
    public int atMost(int[] nums, int k) {
        HashMap<Integer, Integer> map = new HashMap<>();
        int i = 0, j = 0;
        int n = nums.length;
        int res = 0;
        while (j < n) {
            map.put(nums[j], map.getOrDefault(nums[j], 0) + 1);
            while (map.size() > k && i <= j) {
                map.put(nums[i], map.get(nums[i]) - 1);
                if (map.get(nums[i]) == 0) map.remove(nums[i]);
                i++;
            }
            res+= (j-i+1);
            j++;
        }
        return res;
    }
    public int subarraysWithKDistinct(int[] nums, int k) {
        int res = atMost(nums, k) - atMost(nums, k - 1);
        return res;
    }
}