class Solution {
    public int solve(int arr[], int i, int n, int slices,int dp[][]){
        if(slices==0 || i>n) return 0;
        if(dp[i][slices-1]!=-1) return dp[i][slices-1]; 
        int take = arr[i]+solve(arr,i+2,n,slices-1,dp);
        int nottake = solve(arr,i+1,n,slices,dp);
        return dp[i][slices-1] = Math.max(take,nottake);
    }
    public int maxSizeSlices(int[] slices) {
        int dp[][] = new int[slices.length][slices.length/3];
        for(int i=0; i<slices.length; i++) Arrays.fill(dp[i],-1);
        int a = solve(slices,0,slices.length-2,slices.length/3,dp);
        for(int i=0; i<slices.length; i++) Arrays.fill(dp[i],-1);
        int b = solve(slices,1,slices.length-1,slices.length/3,dp);
        return Math.max(a,b);
    }
}