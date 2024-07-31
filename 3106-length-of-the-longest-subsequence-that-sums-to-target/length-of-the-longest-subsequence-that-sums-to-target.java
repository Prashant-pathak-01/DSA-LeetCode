class Solution {
    public int solve(List<Integer> nums, int tar, int i,int dp[][]){
        if(tar==0) return 0;
        if(tar<0) return -nums.size();
        if(i>=nums.size()) return -nums.size();
        if(dp[i][tar]!=-1) return dp[i][tar];
        int take = 1+solve(nums,tar-nums.get(i),i+1,dp);
        int nottake = solve(nums,tar,i+1,dp);
        return dp[i][tar] = Math.max(take,nottake);

    }
    public int lengthOfLongestSubsequence(List<Integer> nums, int target) {
        int dp[][] = new int[nums.size()][target+1];
        for(int i[]:dp) Arrays.fill(i,-1);
        int res=  solve(nums,target,0,dp);
        return res>0?res:-1;
    }
}