class Solution {
    int MOD = (int)1e9+7;
    public int getMaxPal(String s, int i, int j,int dp[][]){
        if(i>j) return 0;
        if(i==j) return 1;
        if(dp[i][j]!=-1) return dp[i][j];
        int res = 0;
        if(s.charAt(i)==s.charAt(j)) {
            res=(2*getMaxPal(s,i+1,j-1,dp))%MOD;
            int left=i+1, right=j-1;
            while(left<=right&&s.charAt(left)!=s.charAt(i)) left++;
            while(left<=right&&s.charAt(right)!=s.charAt(i)) right--;
            if(left<right) res=(res-getMaxPal(s,left+1,right-1,dp))%MOD; 
            else if(left==right) res=(res+1)%MOD; 
            else res=(res+2)%MOD;
        }
        else res = (getMaxPal(s,i+1,j,dp)+ getMaxPal(s,i,j-1,dp)- getMaxPal(s,i+1,j-1,dp))%MOD;
        return dp[i][j] = res<0? res+MOD:res%MOD;
    }
    public int countPalindromicSubsequences(String s) {
        int dp[][] = new int[s.length()][s.length()];
        for(int i=0; i<s.length(); i++) Arrays.fill(dp[i],-1);
        return getMaxPal(s,0,s.length()-1,dp)%MOD;
    }
}