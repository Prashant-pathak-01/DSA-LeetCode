class Solution {
    public int findPath(int arr[][], int dp[][], int i, int j){
        if(i>=arr.length || j>=arr[0].length || j<0) return Integer.MAX_VALUE;
        if(i==arr.length-1) return arr[i][j];
        if(dp[i][j]!=Integer.MAX_VALUE) return dp[i][j];
        return dp[i][j] =  arr[i][j]+Math.min(findPath(arr,dp,i+1,j-1),Math.min(findPath(arr,dp,i+1,j),findPath(arr,dp,i+1,j+1)));
    }
    public int minFallingPathSum(int[][] matrix) {
        int dp[][] = new int[matrix.length][matrix[0].length];
        for(int i=0;i<dp.length; i++) Arrays.fill(dp[i],Integer.MAX_VALUE);
        int res=Integer.MAX_VALUE;
        for(int i=0; i<matrix[0].length; i++){
            res = Math.min(findPath(matrix,dp,0,i),res);
        }
        return res;
    }
}