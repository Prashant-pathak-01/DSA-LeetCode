class Solution {
    public int[] constructArray(int n, int k) {
        int res[] = new int[n];
        for(int i=0; i<n-k; i++){
            res[i] = i+1;
        }
        for(int i = 0; i<=k; i++){
            res[n-k+i-1] = (i%2==0) ?(n-k+i/2):(n-i/2);
        }
        return res;
    }
}