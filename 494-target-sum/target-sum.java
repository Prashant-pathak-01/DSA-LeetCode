class Solution {
    int count = 0;
    public int calc(int arr[], int i, int sum , int tar,int dp[][]){
        if(i==arr.length){
            if(sum==tar) return 1;
            else return 0;
        }
        if(dp[i][sum+1001]!=Integer.MIN_VALUE) return dp[i][sum+1001];
        int add = calc(arr,i+1,sum+arr[i],tar,dp);
        int sub = calc(arr,i+1,sum-arr[i],tar,dp);
        return dp[i][sum+1001] = add+sub;
    }
    public int findTargetSumWays(int[] nums, int target) {
        int dp[][] = new int[nums.length+1][2003];
        for (int i=0; i<nums.length+1; i++){
            for(int j=0; j<2003; j++){
                dp[i][j] = Integer.MIN_VALUE;
            }
        }
        return calc(nums,0,0,target,dp);
    }
}