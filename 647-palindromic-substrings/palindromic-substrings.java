class Solution {
    public boolean isPalindrome(String str,int i, int j,int dp[][]){
        if(i>=j){
            dp[i][j] = 1;
            return true;
        }
        if(dp[i][j]!=-1) return dp[i][j]==1;
        if(str.charAt(i)==str.charAt(j)) {
            dp[i+1][j-1] = isPalindrome(str,i+1,j-1,dp)?1:0;
            return dp[i+1][j-1]==1;
        }else{
            dp[i][j]=0;
            return false;
        }
    }
    public int countSubstrings(String s) {
        int res = 0;
        int dp[][] = new int[s.length()][s.length()];
        for(int i[]:dp) Arrays.fill(i,-1);
        for(int i=0; i<s.length(); i++){
            for(int j=i; j<s.length(); j++){
                if(isPalindrome(s,i,j,dp)) res++;
            }
        }
        return res;
    }
}