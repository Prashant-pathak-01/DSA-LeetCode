class Solution {
    int res= 0;
    public int solve(int arr1[], int arr2[], int i, int j, int dp[][]){
        if(i>=arr1.length || j>=arr2.length) return 0;
        if(dp[i][j]!=-1) return dp[i][j];
        int take =0;
        if(arr1[i]==arr2[j]){
            take = 1+solve(arr1,arr2,i+1,j+1,dp);
            res = Math.max(take,res);
        }
        solve(arr1,arr2,i,j+1,dp);
        solve(arr1,arr2,i+1,j,dp);
        return dp[i][j] = take;
    }
    public int findLength(int[] nums1, int[] nums2) {
        int dp[][] = new int[nums1.length][nums2.length];
        for(int i[]:dp) Arrays.fill(i,-1);
        solve(nums1,nums2,0,0,dp);
        return res;
    }
}