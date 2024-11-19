class Solution {
    public int solve(int arr[], int i, int dp[]){
        if(i>=arr.length) return 0;
        if(dp[i]!=0) return dp[i];
        int take = arr[i]+solve(arr,i+1,dp);
        int notTake = arr[i]+solve(arr,i+2,dp);
        return dp[i] =Math.min(take,notTake);
    }
    public int minCostClimbingStairs(int[] cost) {
        int dp[] = new int[cost.length];
        return Math.min(solve(cost,0,dp),solve(cost,1,dp));
    }
}