class Solution {
    private int checkMaxAmount(int []nums, int i,int []dp, int n){
        if(i>=n) return 0;
        if(dp[i]!=Integer.MIN_VALUE) return dp[i];
        int take = nums[i]+checkMaxAmount(nums,i+2,dp,n);
        int notTake = checkMaxAmount(nums,i+1,dp,n);
        return dp[i] = Math.max(take,notTake);
    }
    public int rob(int[] nums) {
        if(nums.length==1) return nums[0];
        int dp[] = new int[nums.length];
        Arrays.fill(dp,Integer.MIN_VALUE);
        int a = checkMaxAmount(nums,0,dp,nums.length-1);
        Arrays.fill(dp,Integer.MIN_VALUE);
        int b = checkMaxAmount(nums,1,dp,nums.length);
        return Math.max(a,b);
    }
}