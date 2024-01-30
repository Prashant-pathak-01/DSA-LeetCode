class Solution {
    public boolean isMatch(String s, String p, int i, int j,int dp[][]){
        if(i<0 && j<0) return true;
        if(i<0 && j>=0) {
            for(int k=j; k>=0; k-=2){
                if(p.charAt(k)!='*') return false;
            }
                return true;
        }
        if(i>=0 && j<0) return false;
        if(dp[i][j]!=-1) return dp[i][j]==1;
        if(s.charAt(i)==p.charAt(j) || p.charAt(j)=='.') {
            dp[i][j] = isMatch(s,p,i-1,j-1,dp)?1:0;
            return dp[i][j]==1;
            }
        else if(p.charAt(j)=='*'){
            if(s.charAt(i)==p.charAt(j-1) || p.charAt(j-1)=='.'){
                dp[i][j] = (isMatch(s,p,i-1,j,dp) || isMatch(s,p,i,j-2,dp))?1:0;
                return dp[i][j]==1;
            }
            else {
                dp[i][j] = isMatch(s,p,i,j-2,dp)?1:0;
                return dp[i][j]==1;
            } 
        }else return false;
    }
    public boolean isMatch(String s, String p) {
        int dp[][] = new int[s.length()][p.length()];
        for(int i[]:dp) Arrays.fill(i,-1);
        return isMatch(s,p,s.length()-1, p.length()-1,dp);
    }
}