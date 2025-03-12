class Solution {
    public int solve(int arr[], int i, boolean flag, int dp[][]){
        if(i>=arr.length) return 0;
        if(dp[i][flag?1:0]!=-1) return dp[i][flag?1:0];
        if(flag){
            int a = arr[i]+solve(arr,i+1,false,dp);
            int b = solve(arr,i+1,true,dp);
            return dp[i][flag?1:0]=Math.max(a,b);
        }else{
            int a = -arr[i]+solve(arr,i+1,true,dp);
            int b = solve(arr,i+1,false,dp);
            return dp[i][flag?1:0]=Math.max(a,b);
        }
    }
    public int maxProfit(int[] prices) {
        int dp[][] = new int[prices.length][2];
        for(int i=0; i<dp.length; i++) Arrays.fill(dp[i],-1);
        return solve(prices,0,false,dp);
    }
}