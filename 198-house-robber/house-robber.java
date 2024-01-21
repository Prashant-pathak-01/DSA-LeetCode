class Solution {
    private int checkMaxAmount(int []nums, int i,int []dp){
        if(i>=nums.length) return 0;
        if(dp[i]!=Integer.MIN_VALUE) return dp[i];
        int take = nums[i]+checkMaxAmount(nums,i+2,dp);
        int notTake = checkMaxAmount(nums,i+1,dp);
        return dp[i] = Math.max(take,notTake);
    }
    public int rob(int[] nums) {
        int dp[] = new int[nums.length];
        Arrays.fill(dp,Integer.MIN_VALUE);
        return checkMaxAmount(nums,0,dp);
    }
}