class Solution {
    int res =0;
    public int solve(int arr[], int diff,int i, int dp[][]){
        if(i>=arr.length) {
            if(diff==0) return 0;
            else return Integer.MIN_VALUE;
        }
        if(dp[i][diff+5000]!=-1) return dp[i][diff+5000]; 
        int pickA = arr[i]+solve(arr,diff+arr[i],i+1,dp);
        int pickB = arr[i]+solve(arr,diff-arr[i],i+1,dp);
        int skip = solve(arr,diff,i+1,dp);
        return dp[i][diff+5000] = Math.max(skip,Math.max(pickA,pickB));
    }
    public int tallestBillboard(int[] rods) {
        int dp[][] = new int[rods.length][10001];
        for(int i[]:dp) Arrays.fill(i,-1);
        return solve(rods,0,0,dp)/2;
    }
}