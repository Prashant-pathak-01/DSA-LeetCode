class Solution {
    public int solve(int arr[][], int i, int j,int prev,int dp[][]){
        if(i>=arr.length || j>=arr[0].length || i<0 || j<0 || prev>=arr[i][j]) return 0;
        if(dp[i][j]!=-1) return dp[i][j];
        int res = 0;
        res = Math.max(res,1+solve(arr,i+1,j,arr[i][j],dp));
        res = Math.max(res,1+solve(arr,i-1,j,arr[i][j],dp));
        res = Math.max(res,1+solve(arr,i,j+1,arr[i][j],dp));
        res = Math.max(res,1+solve(arr,i,j-1,arr[i][j],dp));
        return dp[i][j] = res;
    }
    public int longestIncreasingPath(int[][] matrix) {
        int res = 0;
        int dp[][] = new int[matrix.length][matrix[0].length];
        for(int i[]:dp) Arrays.fill(i,-1);
        for(int i=0; i<matrix.length; i++){
            for(int j=0; j<matrix[0].length; j++){
                res = Math.max(res,solve(matrix,i,j,matrix[i][j]-1,dp));
            }
        }
        return res;
    }
}