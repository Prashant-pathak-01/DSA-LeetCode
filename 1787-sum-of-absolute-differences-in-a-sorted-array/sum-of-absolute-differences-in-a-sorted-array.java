class Solution {
    public int[] getSumAbsoluteDifferences(int[] nums) {
        int sum = 0;
        for(int i=0; i<nums.length; i++){
            sum+=nums[i];
        }
        int prev = 0;
        int res[] = new int[nums.length];
        for(int i=0; i<nums.length; i++){
            sum-=nums[i];
            res[i] = nums[i]*i-prev+sum-nums[i]*(nums.length-i-1);
            prev+=nums[i];
        }
        return res;
    }
}