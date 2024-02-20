class Solution {
    public int isPal(String s, int i, int j){
    int c = 0;
    while(i<j) {
        if(s.charAt(i)!=s.charAt(j)) c++;
        i++;
        j--;
    }
    return c;
}

    public int soln(String s, int k, int i,int dp[][]){
        if(i>=s.length()) return 0;
        if(k==0) return isPal(s,i,s.length()-1);
        if(dp[i][k]!=-1) return dp[i][k];
        int res = 1000;
        for(int x=i; x<s.length()-1; x++){
            res = Math.min(res,isPal(s,i,x)+soln(s,k-1,x+1,dp));
        }
        return dp[i][k] = res;
    }
    public int palindromePartition(String s, int k) {
        int dp[][] = new int[s.length()][k];
        for(int i=0; i<dp.length; i++) Arrays.fill(dp[i],-1);
        return soln(s,k-1,0,dp);
    }
}