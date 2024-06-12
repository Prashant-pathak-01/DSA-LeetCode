class Solution {
    public int [] removeDuplicates(int arr[]){
        Set<Integer> set = new TreeSet<>();
        for(int i:arr) set.add(i);
        int res[] = new int[set.size()];
        int x = 0;
        for(int i:set) res[x++] = i;
        System.out.println(set);
        return res;
    }
    public int solve(int i, int n, int r, int[] v, int[][] dp) {
        if (i == n) {
            return r;
        }
        if (dp[i][r] != -1) {
            return dp[i][r];
        }
        int include = r;
        if (v[i] > r) {
            include = solve(i + 1, n, r + v[i], v, dp);
        }
        int exclude = solve(i + 1, n, r, v, dp);
        return dp[i][r] = Math.max(include, exclude);
    }

    public int maxTotalReward(int[] v) {
        v = removeDuplicates(v);
        int n = v.length;
        int[][] dp = new int[n][v[v.length-1]*2];
        for (int[] row : dp) {
            Arrays.fill(row, -1);
        }
        return solve(0, n, 0, v, dp);
    }
}
