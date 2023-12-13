class Solution {
    public int numSpecial(int[][] mat) {
        Map<Integer,Integer> row = new HashMap<>();
        Map<Integer,Integer> col = new HashMap<>();
        for(int i=0; i<mat.length; i++){
            row.put(i,0);
            for(int j=0; j<mat[0].length; j++){
                if(i==0) col.put(j,0);
                if(mat[i][j]==1){
                    row.put(i,row.get(i)+1);
                    col.put(j,col.get(j)+1);

                }
            }
        }
        int count =0;
        for(int i=0; i<mat.length; i++){
            for(int j=0; j<mat[0].length; j++){
                if(mat[i][j] == 1 && row.get(i)==1 && col.get(j)==1){
                    count++;
                }
            }
        }
        return count;
    }
}