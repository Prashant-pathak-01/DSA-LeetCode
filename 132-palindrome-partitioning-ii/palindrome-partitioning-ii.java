class Solution {
    public boolean isPalindrome(String s){
        int i= 0;
        int j = s.length()-1;
        while(i<j) if(s.charAt(i++)!=s.charAt(j--)) return false;
        return true;
    }
    public int generate(String s, int dp[]){
        if(s.length()==0){
            return 0;
        }
        if(isPalindrome(s)) return dp[s.length()-1]  = 0;
        if(dp[s.length()-1]!=-1) return dp[s.length()-1];
        int res = s.length()-1;
        for(int i=0; i<s.length(); i++){
            if(isPalindrome(s.substring(0,i+1))){
                res = Math.min(res,1+generate(s.substring(i+1),dp));
            }
        }
        return dp[s.length()-1] = res;
    }
    public int minCut(String s) {
        int dp[] = new int[s.length()];
        Arrays.fill(dp,-1);
        return generate(s,dp);
    }
}