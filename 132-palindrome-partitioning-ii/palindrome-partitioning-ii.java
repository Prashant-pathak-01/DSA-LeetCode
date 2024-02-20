class Solution {
    public boolean isPalindrome(String s, int i, int j){
        while(i<j) if(s.charAt(i++)!=s.charAt(j--)) return false;
        return true;
    }
    public int generate(String s, int dp[],int indx){
        if(s.length()==indx){
            return 0;
        }
        if(dp[indx]!=-1) return dp[indx];
        if(isPalindrome(s,indx,s.length()-1)) return dp[indx]  = 0;
        int res = Integer.MAX_VALUE;
        for(int i=indx; i<s.length(); i++){
            if(isPalindrome(s,indx,i)){
                res = Math.min(res,1+generate(s,dp,i+1));
            }
        }
        return dp[indx] = res;
    }
    public int minCut(String s) {
        int dp[] = new int[s.length()];
        Arrays.fill(dp,-1);
        return generate(s,dp,0);
    }
}