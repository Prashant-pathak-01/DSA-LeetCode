class Solution {
    int MOD = (int)1e9+7;
    public int solve(int n, int i, int j,int dp[][][]){
        if((i==3 && j==0) ||(i==3 && j==2)) return 0;
        if(i>=4 || j>=3 || i<0 || j<0) return 0;
        if(dp[n][i][j]!=-1) return dp[n][i][j];
        if(n==0) return 1;

        int res =0 ;
        int l[] = {2,2,1,-1,-2,-2,1,-1};
        int r[] = {1,-1,2,2,1,-1,-2,-2};

        for(int x=0; x<8; x++){
            res=(res+solve(n-1,i+l[x],j+r[x],dp))%MOD;
        }
        return dp[n][i][j]=res%MOD;
    }
    public int knightDialer(int n) {
        int res= 0;
        int dp[][][] = new int[n][4][4];
        for(int i[][]:dp) for(int j[]:i) Arrays.fill(j,-1);
        for(int i=0; i<4; i++){
            for(int j=0; j<4; j++){
                res=(res+solve(n-1,i,j,dp))%MOD;
            }
        }
        return res%MOD;
    }
}