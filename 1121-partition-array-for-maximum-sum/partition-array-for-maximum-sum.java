class Solution {
    public int maxSumAfterPartitioning(int arr[], int i, int n,int []dp){
        if(i>=arr.length) return 0;
        if(dp[i]!=-1) return dp[i];
        int res = 0;
        int max = -1;
        int count = 0;
        for(int k=i; k<Math.min(i+n,arr.length); k++){
            max = Math.max(max,arr[k]);
            count++;
            res = Math.max(res,max*count+maxSumAfterPartitioning(arr,k+1,n,dp));
        }
        return dp[i] = res;
    }
    public int maxSumAfterPartitioning(int[] arr, int k) {
        int dp[] = new int[arr.length];
        Arrays.fill(dp,-1);
        return maxSumAfterPartitioning(arr,0,k,dp);
    }
}