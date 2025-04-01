class Solution {
    public long solve(int arr[][], int i,long dp[]){
        if(i>=arr.length) return 0;
        if(dp[i]!=-1) return dp[i];
        long take = arr[i][0]+solve(arr,i+arr[i][1]+1,dp);
        long nottake = solve(arr,i+1,dp);
        return dp[i] = Math.max(take,nottake);
    }
    public long mostPoints(int[][] questions) {
        long dp[] = new long[questions.length];
        Arrays.fill(dp,-1);
        return solve(questions,0,dp);
    }
}