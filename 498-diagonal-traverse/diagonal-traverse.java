class Solution {
    public int[] findDiagonalOrder(int[][] mat) {
        int res[] = new int[mat.length*mat[0].length];
        int r =0 ;
        int c  = 0;
        int indx =  0;
        for(int i=0; r<mat.length && c<mat[0].length ; i++){
            if(i%2==0){
                while(r>=0 && c>=0 && r<mat.length && c<mat[0].length){
                    res[indx++] = mat[r][c];
                    r--;
                    c++;
                }
                if(c==mat[0].length){
                    c--;
                    r+=2;
                }else{
                    r++;
                }
            }else{
                while(r>=0 && c>=0 && r<mat.length && c<mat[0].length){
                    res[indx++] = mat[r][c];
                    r++;
                    c--;
                }
                if(r==mat.length){
                    c+=2;
                    r--;
                }else{
                    c++;
                }
            }
        }
        return res;
    }
}