class Solution {
    public int solve(String str, int i, int j, int dp[][]){
        if(i==j) return 1;
        if(dp[i][j]!=-1) return dp[i][j];
        int res=  Integer.MAX_VALUE;
        for(int x=i; x<j; x++){
            res = Math.min(res,solve(str,i,x,dp)+solve(str,x+1,j,dp));
        }
        return dp[i][j] = str.charAt(i)==str.charAt(j)?res-1:res;
    }
    public int strangePrinter(String s) {
        int dp[][] = new int[s.length()][s.length()];
        for(int i[]:dp) Arrays.fill(i,-1);
        return solve(s,0,s.length()-1,dp);
    }
}