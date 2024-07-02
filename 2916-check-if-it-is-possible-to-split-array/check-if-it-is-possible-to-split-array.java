class Solution {
    public boolean solve(List<Integer> nums, int m, int i, int j,int sum,int dp[][]){
        if(j-i<=1) return true;
        if(dp[i][j]!=0) return dp[i][j]==1;
        boolean res = false;
        if(sum-nums.get(i)>=m) res = res || solve(nums,m,i+1,j, sum-nums.get(i),dp);
        if(sum-nums.get(j)>=m) res = res || solve(nums,m,i,j-1,sum-nums.get(j),dp);
        dp[i][j] = res?1:-1;
        return res;
    }
    public boolean canSplitArray(List<Integer> nums, int m) {
        int sum = 0;
        for(int x:nums) sum+=x;
        int dp[][] = new int[nums.size()][nums.size()];
        return solve(nums,m,0,nums.size()-1,sum,dp);
    }
}