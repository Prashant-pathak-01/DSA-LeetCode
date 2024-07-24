class Solution {
    public long solve(int nums[], int i, boolean flag, long dp[][]){
        if(i>=nums.length) return 0;
        if(dp[i][flag?1:0]!=-1) return dp[i][flag?1:0];
        long take = (flag?nums[i]:-nums[i])+solve(nums, i+1,!flag ,dp);
        long nottake = solve(nums,i+1,flag,dp);
        return dp[i][flag?1:0] = Math.max(take,nottake); 
    }
    public long maxAlternatingSum(int[] nums) {
        long dp[][] = new long[nums.length][2];
        for(int i=0; i<nums.length; i++) Arrays.fill(dp[i],-1);
        return solve(nums,0,true,dp);
    }
}