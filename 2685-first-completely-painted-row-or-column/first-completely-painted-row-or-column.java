class Solution {
    class Pair{
        int i;
        int j;
        Pair(int i, int j){
            this.i = i;
            this.j = j;
        }
    }
    public int firstCompleteIndex(int[] arr, int[][] mat) {
        Pair counter[] = new Pair[mat.length*mat[0].length];
        for(int i=0; i<mat.length; i++){
            for(int j=0; j<mat[0].length; j++){
                counter[mat[i][j]-1] = new Pair(i,j);
            }
        }
        int r[] = new int[mat.length];
        int c[] = new int[mat[0].length];
        for(int i=0; i<arr.length; i++){
            r[counter[arr[i]-1].i]++;
            if(r[counter[arr[i]-1].i]==mat[0].length) return i;
            c[counter[arr[i]-1].j]++;
            if(c[counter[arr[i]-1].j]==mat.length) return i;

        }
        return -1;
    }
}