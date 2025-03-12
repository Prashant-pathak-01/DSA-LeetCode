class Solution {
    public int solve(int arr[], int i, int l, int r, int dp[][]){
        if(i>=arr.length) return Math.abs(l-r);
        if(dp[i][l]!=-1) return dp[i][l];
        int takeLeft = solve(arr,i+1,l+arr[i],r,dp);
        int takeRight = solve(arr,i+1,l,r+arr[i],dp);
        return dp[i][l]=Math.min(takeLeft,takeRight);
    }
    public int lastStoneWeightII(int[] stones) {
        int sum =0;
        for(int i:stones) sum+=i;
        int dp[][] = new int[stones.length][sum+1];
        for(int i[]:dp) Arrays.fill(i,-1);
        return solve(stones,0,0,0,dp);
    }
}