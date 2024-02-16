class Solution {
    public boolean generateSoln(char board[][], String word, int i, int j, boolean mark[][],int indx){
        if(i>=board.length || j>=board[0].length || i<0 || j<0 || mark[i][j]) {
            if(indx==word.length()) return true;
            return false;
        };
        if(indx==word.length()) return true;
        boolean res = false;
        mark[i][j] = true;
        if(board[i][j]==word.charAt(indx)){
            res =res || generateSoln(board,word,i+1,j,mark,indx+1);
            res =res || generateSoln(board,word,i-1,j,mark,indx+1);
            res =res || generateSoln(board,word,i,j+1,mark,indx+1);
            res =res || generateSoln(board,word,i,j-1,mark,indx+1);
        }
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