class Solution {
    public int solve(int mat[][], int tar, int i, int sum,int dp[][]){
        if(i>=mat.length) return Math.abs(tar-sum);
        if(dp[i][sum]!=-1) return dp[i][sum];
        int res = Integer.MAX_VALUE;
        for(int j=0; j<mat[0].length; j++){
            res = Math.min(res,solve(mat,tar,i+1,sum+mat[i][j],dp));
        }
        return dp[i][sum] = res;

    }
    public int minimizeTheDifference(int[][] mat, int target) {
        int dp[][] = new int[mat.length][5001];
        for(int i=0; i<dp.length; i++) Arrays.fill(dp[i],-1);
        return solve(mat,target,0,0,dp);
    }
}