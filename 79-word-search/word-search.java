class Solution {
    public boolean generateSoln(char board[][], String word, int i, int j,int indx){
        if(indx==word.length()) return true;
        if(i>=board.length || j>=board[0].length || i<0 || j<0 || board[i][j] == '#' || board[i][j]!=word.charAt(indx)) return false;
        boolean res = false;
        char temp = board[i][j];
        board[i][j] = '#';
        res =res || generateSoln(board,word,i+1,j,indx+1);
        res =res || generateSoln(board,word,i-1,j,indx+1);
        res =res || generateSoln(board,word,i,j+1,indx+1);
        res =res || generateSoln(board,word,i,j-1,indx+1);
        board[i][j] = temp;
        return res;

    }
    public boolean exist(char[][] board, String word) {
        boolean res = false;
        for(int i=0; i<board.length; i++){
            for(int j=0; j<board[0].length; j++){
                res = res || generateSoln(board,word,i,j,0);
                if(res==true) return res;
            }
        }
        return res;
    }
}