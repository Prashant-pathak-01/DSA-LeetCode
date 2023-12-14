class Solution {
    public int[][] onesMinusZeros(int[][] matrix) {
        Map<Integer,Integer> row = new HashMap<>();
        Map<Integer,Integer> col = new HashMap<>();
        int n = matrix.length;
        int m = matrix[0].length;

        for(int i=0; i<n; i++){
            row.put(i,0);
            for(int j=0; j<m; j++){
                if(i==0){
                    col.put(j,0);
                }
                if(matrix[i][j]==1){
                    row.put(i,row.get(i)+1);
                    col.put(j,col.get(j)+1);
                }
            }
        }
        for(int i=0; i<n; i++){
            int a = row.get(i);
            for(int j=0; j<m; j++){
                int b = col.get(j);
                matrix[i][j] = a+b-(n-a)-(m-b);
            }
        }
        return matrix;
    }
}