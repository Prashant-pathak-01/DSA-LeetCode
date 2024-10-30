class Solution {
    public int countSquares(int[][] matrix) {
        int res =0;
        for(int i=0; i<matrix.length; i++) res+=matrix[i][0];
        for(int i=1; i<matrix[0].length; i++) res+=matrix[0][i];
        for(int i=1; i<matrix.length; i++){
            for(int j=1; j<matrix[0].length; j++){
                if(matrix[i][j]==1) matrix[i][j] = 1+Math.min(matrix[i-1][j],Math.min(matrix[i][j-1],matrix[i-1][j-1]));
                res+=matrix[i][j];
            }
        }
        return res;
    }
}