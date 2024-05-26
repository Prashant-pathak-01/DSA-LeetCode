class Solution {
    int MOD = 1000000007;

    public int check(int i, int a, int l, int n, int[][][] temp) {
        if (i == n) {
            return 1;
        }
        if (temp[i][a][l] != -1) {
            return temp[i][a][l];
        }
        int withA = (a == 0) ? check(i + 1, a + 1, 0, n, temp) : 0;
        int withL = (l == 2) ? 0 : check(i + 1, a, l + 1, n, temp);
        int withP = check(i + 1, a, 0, n, temp);
        int total = ((withA + withL) % MOD + withP) % MOD;
        return temp[i][a][l] = total;
    }

    public int checkRecord(int n) {
        int[][][] temp = new int[n][2][3];
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < 2; j++) {
                for (int k = 0; k < 3; k++) {
                    temp[i][j][k] = -1;
                }
            }
        }
        return check(0, 0, 0, n, temp);
    }
}