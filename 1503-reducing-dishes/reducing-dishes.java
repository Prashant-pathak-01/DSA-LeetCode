class Solution {
    public int solve(int arr[], int i, int prev, int dp[][]){
        if(i>=arr.length) return 0;
        if(dp[i][prev]!=-1) return dp[i][prev];
        int take = prev*arr[i]+solve(arr,i+1,prev+1,dp);
        int nottake = solve(arr,i+1,prev,dp);
        return dp[i][prev] = Math.max(take,nottake);

    }
    public int maxSatisfaction(int[] satisfaction) {
        Arrays.sort(satisfaction);
        int dp[][] = new int[satisfaction.length][satisfaction.length+1];
        for(int i[]:dp) Arrays.fill(i,-1);
        return solve(satisfaction,0,1,dp);
    }
}