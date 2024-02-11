class Solution {
    public void addBoard(List<String> list, char soln[][]){
        for(int i=0; i<soln.length; i++){
            String temp = "";
            for(int j=0; j<soln.length; j++){
                temp = temp+soln[i][j];
            }
            list.add(temp);
        }
        return;
    }

    public boolean isSafe(char[][] soln,int i,int j){
        for(int x=0; x<i; x++){
            if(soln[x][j]=='Q') return false;
        }
        for (int x = 1; x <= Math.min(i, j); x++) {
            if (soln[i - x][j - x] == 'Q') return false;
        }
        for (int x = 1; x <= Math.min(i, soln.length - 1 - j); x++) {
            if (soln[i - x][j + x] == 'Q') return false;
        }

        return true;
    }

    public void generateSoln(char soln[][], int i, List<List<String>> list){
        if(i==soln.length){
            List<String> temp  = new ArrayList<>();
            addBoard(temp,soln);
            list.add(new ArrayList<>(temp));
            return;
        }
        for(int x=0; x<soln.length; x++){
            if(isSafe(soln,i,x)){
                soln[i][x] = 'Q';
                generateSoln(soln,i+1,list);
                soln[i][x] = '.';
            }
        }
        return;
    }
    public List<List<String>> solveNQueens(int n) {
        List<List<String>> list = new ArrayList<>();
        char[][] soln = new char[n][n];
        for(int i=0; i<soln.length; i++){
            for(int j=0; j<soln.length; j++){
                soln[i][j] = '.';
            }
        }
        generateSoln(soln,0,list);
        return list;
    }
}