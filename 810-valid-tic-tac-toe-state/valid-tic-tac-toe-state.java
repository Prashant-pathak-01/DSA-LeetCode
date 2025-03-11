class Solution {
    public boolean validTicTacToe(String[] board) {
        int x =0;
        int o =0;
        int rowX =0;
        int rowO =0;
        int colX =0;
        int colO =0;
        for(int i=0; i<board.length; i++){
            int countx1 =0;
            int countx2 =0;
            int counto1 =0;
            int counto2 =0;
            for(int j=0; j<board[i].length(); j++){
                if(board[i].charAt(j)=='X') {
                    x++;
                    countx1++;
                }
                else if(board[i].charAt(j)=='O') {
                    o++;
                    counto1++;
                }
                if(board[j].charAt(i)=='X') countx2++;
                else if(board[j].charAt(i)=='O') counto2++;
            }
            if(countx1==3) rowX++;
            else if(counto1==3) rowO++;
            if(countx2==3) colX++;
            else if(counto2==3) colO++;
        }
       // System.out.println(x+" "+o+" "+rowX+" "+colX+" "+colO+" "+rowO);
        if(o>x || x-1>o || rowX>=2 || rowO>=2 || colO>=2 || colX>=2 || (rowX==1 && rowO==1) || (colO==1 && colX==1) || ((rowX==1|| colX==1) && o>=x) || ((rowO==1|| colO==1) && o!=x)) return false;
        
        if(board[0].charAt(0)==board[1].charAt(1) && board[2].charAt(2)==board[1].charAt(1) && board[0].charAt(0)!=' ') {
            if(board[0].charAt(0)=='O' && o!=x) return false;
            else if(board[0].charAt(0)=='X' && o>=x) return false;     
        }

        if(board[0].charAt(2)==board[1].charAt(1) && board[2].charAt(0)==board[1].charAt(1) && board[0].charAt(2)!=' ') {
            if(board[0].charAt(2)=='O' && o!=x) return false;
            else if(board[0].charAt(2)=='X' && o>=x) return false;     
        }

        return true;
    }
}