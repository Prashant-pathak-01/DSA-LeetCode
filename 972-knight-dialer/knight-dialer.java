class Solution {
    int mod = (int)1e9+7;
    public long getMax(int i, int j, int n, int indx,long [][][]dp){
        if(i>=4 || i<0 || j>=3 || j<0 || (i==3 && j==0) || (i==3 && j==2)) return 0;
        if(indx==n) return 1;
        if(dp[i][j][indx]!=-1) return dp[i][j][indx];
        long a = getMax(i+2,j-1,n,indx+1,dp)%mod;
        long b = getMax(i+2,j+1,n,indx+1,dp)%mod;
        long c = getMax(i-2,j+1,n,indx+1,dp)%mod;
        long d = getMax(i-2,j-1,n,indx+1,dp)%mod;
        long e = getMax(i-1,j+2,n,indx+1,dp)%mod;
        long f = getMax(i+1,j+2,n,indx+1,dp)%mod;
        long g = getMax(i-1,j-2,n,indx+1,dp)%mod;
        long h = getMax(i+1,j-2,n,indx+1,dp)%mod;
        return dp[i][j][indx] =  (a+b+c+d+e+f+g+h)%mod;

    }
    public int knightDialer(int n) {
        int res = 0;
        long dp[][][] = new long[4][3][n+1];
        for(long [][]i:dp) for(long j[]:i) Arrays.fill(j,-1);
        for(int i=0; i<=3; i++){
            for(int j=0; j<=2; j++){
                res=(res+(int)getMax(i,j,n,1,dp))%mod;
            }
        }
        return res%mod;
    }
}