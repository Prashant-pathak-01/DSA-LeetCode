class Solution {
    public boolean generateSoln(char board[][], String word, int i, int j, boolean mark[][],int indx){
        if(indx==word.length()) return true;
        if(i>=board.length || j>=board[0].length || i<0 || j<0 || mark[i][j]) return false;
        if(board[i][j]!=word.charAt(indx)) return false;
        boolean res = false;
        mark[i][j] = true;
            res =res || generateSoln(board,word,i+1,j,mark,indx+1);
            res =res || generateSoln(board,word,i-1,j,mark,indx+1);
            res =res || generateSoln(board,word,i,j+1,mark,indx+1);
            res =res || generateSoln(board,word,i,j-1,mark,indx+1);
        mark[i][j] = false;

        return res;

    }
    public boolean exist(char[][] board, String word) {
        boolean res = false;
        for(int i=0; i<board.length; i++){
            for(int j=0; j<board[0].length; j++){
                boolean mark[][] = new boolean[board.length][board[0].length];
                res = res || generateSoln(board,word,i,j,mark,0);
                if(res==true) return res;
            }
        }
        return res;
    }
}