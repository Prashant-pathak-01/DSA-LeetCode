class Solution {
    int dp[][][];
    public int solve(int nums[], int i, int prev,int mod){
        if(i>=nums.length) return 0;
        int take=0 ;
        if(dp[i][prev][mod]!=-1) return dp[i][prev][mod];
        if(prev==2) {
            take = 1+solve(nums,i+1,nums[i]%2,mod);
        }else if(mod==2){
            take = 1+solve(nums,i+1,nums[i]%2,(prev+nums[i])%2);
        }
        else if((prev+nums[i])%2==mod) take = 1+solve(nums,i+1,nums[i]%2,mod);
        int nottake =solve(nums,i+1,prev,mod);
        return dp[i][prev][mod] = Math.max(take,nottake);
    }
    public int maximumLength(int[] nums) {
        dp = new int[nums.length+1][3][3];
        for(int i[][]:dp) for(int j[]:i) Arrays.fill(j,-1);
        return solve(nums,0,2,2);
    }
}