class Solution {
    private int arr[][] = new int[9][9];
    private boolean modify[][] = new boolean[9][9];
    private void makeBoard(char [][]board){
        for(int i=0; i<9; i++){
            for(int j=0; j<9; j++){
                if(board[i][j]=='.') modify[i][j] = true;
                else arr[i][j] = Integer.parseInt(String.valueOf(board[i][j])); 
            }
        }
    }
    private boolean checkRow(int n){
        int marked[] = new int[10];
        for(int i=0; i<9; i++){
            if(arr[n][i]==0) continue;
            if(marked[arr[n][i]]!=0){
                return false;
            } else marked[arr[n][i]] = 1;
        }
        return true;
    }

    private boolean checkCol(int n){
        int marked[] = new int[10];
        for(int i=0; i<9; i++){
            if(arr[i][n]==0) continue;
            if(marked[arr[i][n]]!=0){
                return false;
            } else marked[arr[i][n]] = 1;
        }
        return true;
    }

    private boolean checksubBox(int m,int n){
        Set<Integer> set = new HashSet<>();
        m/=3;
        n/=3;
        m*=3;
        n*=3;

        for(int i=m; i<m+3; i++){
            for(int j=n; j<n+3; j++){
                if(arr[i][j]==0) continue;
                if(set.contains(arr[i][j])) return false;
                else set.add(arr[i][j]);
            }
        }
        return true;
    }

    private boolean solveTheSudoku(int i,int j){
        if(i==9) return true;
        if(j==arr.length) return solveTheSudoku(i+1,0);
        if(!modify[i][j]) return solveTheSudoku(i,j+1);
        for(int k=1; k<=9; k++){
                arr[i][j] = k;
                if(checkRow(i) && checkCol(j) && checksubBox(i,j) && solveTheSudoku(i,j+1)){
                    return true;
            }
        }
        arr[i][j] = 0;
        return false;

    }


    public void solveSudoku(char[][] board) {
        makeBoard(board);
        solveTheSudoku(0,0);
        for(int i=0; i<9; i++){
            for(int j=0; j<9; j++){
                board[i][j] = (char)('0'+arr[i][j]);
            }
        }
    }
}