public class Solution {
    public int minimumMountainRemovals(int[] nums) {
        int[] left = new int[nums.length];
        int[] right = new int[nums.length];
        Arrays.fill(left,1);
        Arrays.fill(right,1);
        for (int i=0; i<nums.length; i++) {
            for (int j=0; j<i; j++) {
                if (nums[i]>nums[j]) {
                    left[i] = Math.max(left[i],left[j]+1);
                }
            }
        }
        for (int i = nums.length-1; i>=0; i--) {
            for (int j = nums.length-1; j>i; j--) {
                if (nums[i] >nums[j]) {
                    right[i] = Math.max(right[i], right[j] + 1);
                }
            }
        }
        int ans = 0;
        for (int i = 0; i <nums.length; i++) {
            if (left[i] != 1 && right[i] != 1) {
                ans = Math.max(ans, left[i] + right[i]);
            }
        }
        return nums.length- ans + 1;
    }
}