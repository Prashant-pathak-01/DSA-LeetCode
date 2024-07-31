class Solution {
    public int solve(int nums[], int k, int i,int dp[][]){
        if(k==0 && i==nums.length) return 0;
        if(k==0 || i==nums.length) return Integer.MAX_VALUE;
        if(dp[i][k]!=-1) return dp[i][k];
        int sum = 0;
        int res = Integer.MAX_VALUE;
        for(int x=i; x<nums.length; x++){
            sum+=nums[x];
            int nextSum = solve(nums,k-1,x+1,dp);
            res = Math.min(res,Math.max(sum,nextSum));
        }
        return dp[i][k] = res;
         
    }
    public int splitArray(int[] nums, int k) {
        int dp[][] = new int[nums.length][k+1];
        for(int i[]:dp) Arrays.fill(i,-1);
        return solve(nums,k,0,dp);
    }
}