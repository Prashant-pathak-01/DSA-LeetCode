class Solution {
    public long countSubarrays(int[] nums, int minK, int maxK) {
        long res = 0;
        int temp = -1;
        int i = -1;
        int j = -1;
        for (int x = 0; x < nums.length; x++) {
            if (!(minK <= nums[x] && nums[x] <= maxK)) temp = x;
            if (nums[x] == minK) i=x;
            if (nums[x] == maxK) j=x;
            res += Math.max(0, Math.min(i, j)-temp);
        }
        return res;
    }
}