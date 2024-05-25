class Solution {
    public int[][] restoreMatrix(int[] rowSum, int[] colSum) {
        int res[][]  = new int[rowSum.length][colSum.length];
        for(int i=0; i<rowSum.length; i++){
            for(int j=0; j<colSum.length; j++){
                int temp =  Math.min(rowSum[i],colSum[j]);
                res[i][j] =temp;
                rowSum[i]-=temp;
                colSum[j]-=temp;
            }
        }
        return res;
    }
}