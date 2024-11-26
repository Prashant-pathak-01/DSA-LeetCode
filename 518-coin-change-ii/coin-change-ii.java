class Solution {
    public int solve(int coins[], int tar, int i, int dp[][]){
        if(tar<0) return 0;
        if(tar==0) return 1;
        if(i>=coins.length) return 0;
        if(dp[tar][i]!=-1) return dp[tar][i];
        int res = 0;
        for(int x=i; x<coins.length; x++){
            res+=solve(coins,tar-coins[x],x,dp);
        }
        return dp[tar][i]=res;
    }
    public int change(int amount, int[] coins) {
        int dp[][] = new int[amount+1][coins.length];
        for(int i=0; i<=amount; i++) Arrays.fill(dp[i],-1);
        return solve(coins,amount,0,dp);
    }
}