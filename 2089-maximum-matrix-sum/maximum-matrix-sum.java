class Solution {
    public long maxMatrixSum(int[][] matrix) {
        long res =0;
        int min = Integer.MAX_VALUE;
        int count =0;
        boolean zero = false;
        for(int i=0; i<matrix.length; i++){
            for(int j=0; j<matrix[0].length; j++){
                res+=Math.abs(matrix[i][j]);
                min =Math.min(min,Math.abs(matrix[i][j]));
                if(matrix[i][j]<0) count++;
                if(matrix[i][j]==0) zero = true;
            }
        }
        //System.out.println(res+" "+min);
        if(count%2==0 || zero) return res;
        else return res-(2*min);
    }
}