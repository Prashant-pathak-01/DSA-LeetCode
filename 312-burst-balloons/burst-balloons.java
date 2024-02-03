class Solution {
    public int getMaxCoins(int arr[], int i, int j,int dp[][]){
        if(i+1==j) return 0;
        if(dp[i][j]!=0) return dp[i][j];
        int res = 0;
        for(int k=i+1; k<j; k++){
            res = Math.max(res,arr[i]*arr[k]*arr[j]+getMaxCoins(arr,i,k,dp)+getMaxCoins(arr,k,j,dp));
        }
        return dp[i][j] = res;
    }
    public int maxCoins(int[] nums) {
        int arr[] = new int[nums.length+2];
        arr[0] = 1;
        arr[arr.length-1] = 1;
        int dp[][] = new int[nums.length+2][nums.length+2];
        for(int i=0; i<nums.length; i++) arr[i+1] = nums[i];
        return getMaxCoins(arr,0,arr.length-1,dp);
    }

}