class Solution {
    public boolean solve(int arr[], int i, int j, int sum1, int sum2, boolean alice,int dp[][][]){
        if(i>=j){
            if(sum1>sum2) return true;
            return false;
        }
        int k = alice?1:0;
        if(dp[i][j][k]!=0) return dp[i][j][k]==1?true:false;
        boolean takeL;
        boolean takeR;
        if(alice){
            takeL = solve(arr,i+1,j,sum1+arr[i],sum2,!alice,dp);
            takeR = solve(arr,i,j-1,sum1+arr[j],sum2,!alice,dp);
        }else{
            takeL = solve(arr,i+1,j,sum1,sum2+arr[i],!alice,dp);
            takeR = solve(arr,i,j-1,sum1,sum2+arr[j],!alice,dp);
        }
        dp[i][j][k] = (takeL||takeR)?1:-1;
        return  takeL||takeR;
    }
    public boolean stoneGame(int[] piles) {
        int dp[][][] = new int[piles.length][piles.length][2];
        return solve(piles,0,piles.length-1,0,0,true,dp);
    }
}