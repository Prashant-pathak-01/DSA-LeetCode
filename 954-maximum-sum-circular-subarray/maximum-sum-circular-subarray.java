class Solution {
    public int maxSubarraySumCircular(int[] nums) {
        int maxSum = nums[0];
        int minSum = nums[0];
        int a =nums[0];
        int b = nums[0];
        int sum = nums[0];
        for(int i=1; i<nums.length; i++){
            sum+=nums[i];
            a = Math.max(nums[i],a+nums[i]);
            b = Math.min(nums[i],b+nums[i]);
            maxSum = Math.max(maxSum,a);
            minSum = Math.min(minSum,b);
        }
        if(sum==minSum) return maxSum;
        return Math.max(maxSum,sum-minSum);
    }
}