class Solution {
    public int solve(String s, int i, int dp[]){
        if(i>=s.length()) return 1;
        if(s.charAt(i)=='0') return 0;
        if(dp[i]!=-1) return dp[i];
        int group =0;
        if(i<s.length()-1 && Integer.parseInt(s.substring(i,i+2))<=26) group = solve(s,i+2,dp);
        int noGroup = solve(s,i+1,dp);
        return dp[i] = group+noGroup;
    }
    public int numDecodings(String s) {
        int dp[] = new int[s.length()];
        Arrays.fill(dp,-1);
        return solve(s,0,dp);
    }
}