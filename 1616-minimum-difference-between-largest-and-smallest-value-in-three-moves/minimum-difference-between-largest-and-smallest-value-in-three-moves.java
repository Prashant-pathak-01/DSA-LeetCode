class Solution {
    public int minDifference(int[] nums) {
        if(nums.length<4) return 0;
        Arrays.sort(nums);
        int a = nums[nums.length-1]-nums[3];
        int b = nums[nums.length-2]-nums[2];
        int c = nums[nums.length-3]-nums[1];
        int d = nums[nums.length-4]-nums[0];
        return Math.min(a,Math.min(b,Math.min(c,d)));
    }
}