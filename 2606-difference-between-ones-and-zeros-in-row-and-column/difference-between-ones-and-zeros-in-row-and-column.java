class Solution {
    public int[][] onesMinusZeros(int[][] matrix) {
        Map<Integer,Integer> row = new HashMap<>();
        Map<Integer,Integer> col = new HashMap<>();
        for(int i=0; i<matrix.length; i++){
            row.put(i,0);
            for(int j=0; j<matrix[0].length; j++){
                if(i==0){
                    col.put(j,0);
                }
                if(matrix[i][j]==1){
                    row.put(i,row.get(i)+1);
                    col.put(j,col.get(j)+1);
                }
            }
        }
        for(int i=0; i<matrix.length; i++){
            for(int j=0; j<matrix[0].length; j++){
                matrix[i][j] = row.get(i)+col.get(j)-(matrix.length-row.get(i))-(matrix[0].length-col.get(j));
            }
        }
        return matrix;
    }
}