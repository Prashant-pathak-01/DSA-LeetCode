class Solution {
    int MOD = (int)1e9+7;
    public int solve(int arr[], int i, int n, int tar, int dp[][]){
        int res = 0;
        if(dp[i][tar]!=-1) return dp[i][tar];
        if(i==n) res++;
        for(int x=0; x<arr.length; x++){
            if(x==i) continue;
            int abs = Math.abs(arr[x]-arr[i]);
            if(tar-abs>=0) res= (res+solve(arr,x,n,tar-abs,dp))%MOD;
        }
        return dp[i][tar] = res%MOD;
        
    }
    public int countRoutes(int[] locations, int start, int finish, int fuel) {
        int dp[][] = new int[locations.length][fuel+1];
        for(int i[]:dp) Arrays.fill(i,-1);
        return solve(locations,start,finish,fuel,dp)%MOD;
    }
}