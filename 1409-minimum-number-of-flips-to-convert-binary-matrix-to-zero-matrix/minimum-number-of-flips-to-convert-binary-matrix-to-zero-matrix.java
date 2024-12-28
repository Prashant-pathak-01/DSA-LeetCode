class Solution {
    public void flip(int mat[][], int i, int j){
        mat[i][j]+=1;
        mat[i][j]%=2;
        if(i>0){
            mat[i-1][j]+=1;
            mat[i-1][j]%=2;
        }
        if(i<mat.length-1){
            mat[i+1][j]+=1;
            mat[i+1][j]%=2;
        }
        if(j>0){
            mat[i][j-1]+=1;
            mat[i][j-1]%=2;
        }
        if(j<mat[0].length-1){
            mat[i][j+1]+=1;
            mat[i][j+1]%=2;
        }
    }
    public boolean isValid(int mat[][]){

        for(int i[]:mat) {
           // System.out.println(Arrays.toString(i));
            for(int j:i) if(j==1) return false;
        }
       // System.out.println();
        return true;
    }
    class Pair{
        int cost;
        boolean flag;
        Pair(int cost, boolean flag){
            this.cost = cost;
            this.flag = flag;
        }
    }
    public Pair solve(int mat[][], int i, int j){
        if(j>=mat[0].length) return solve(mat,i+1,0);
        if(i==mat.length){

            boolean check = isValid(mat);
            return new Pair(0,check);
        }
        flip(mat,i,j);
        Pair yes = solve(mat,i,j+1);
        yes.cost++;
        flip(mat,i,j);
        Pair no = solve(mat,i,j+1);
        int min = Integer.MAX_VALUE;
        if(yes.flag) min = Math.min(yes.cost,min);
        if(no.flag) min = Math.min(no.cost,min);
        return new Pair(min,yes.flag||no.flag);

    }
    public int minFlips(int[][] mat) {
        Pair res = solve(mat,0,0);
        return res.flag?res.cost:-1;
        

    }
}