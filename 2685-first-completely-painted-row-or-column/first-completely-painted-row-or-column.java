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
        int r[] = new int[mat.length];
        int c[] = new int[mat[0].length];
        Map<Integer,Pair> map = new HashMap<>();
        for(int i=0; i<mat.length; i++){
            for(int j=0; j<mat[0].length; j++){
                map.put(mat[i][j],new Pair(i,j));
            }
        }
        for(int i=0; i<arr.length; i++){
            r[map.get(arr[i]).i]++;
            c[map.get(arr[i]).j]++;
            if(r[map.get(arr[i]).i]==mat[0].length) return i;
            if(c[map.get(arr[i]).j]==mat.length) return i;

        }
        return -1;
    }
}