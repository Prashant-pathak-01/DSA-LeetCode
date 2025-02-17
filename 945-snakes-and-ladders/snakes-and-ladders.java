class Solution {
    public int[] getCor(int num, int n){
        int row = n - (num - 1) / n - 1;
        int col = (num - 1) % n;
        if (row % 2 == n % 2) {
            return new int[]{row, n - 1 - col};
        } else {
            return new int[]{row, col};
        }
    }
    public int snakesAndLadders(int[][] board) {
        Queue<Integer> q = new LinkedList<>();
        boolean visited[][] = new boolean[board.length][board[0].length];
        q.add(1);
        int res= 0;
        
        visited[board.length-1][0] = true;
        while(!q.isEmpty()){
            int size = q.size();
            while(size-->0){
                int temp = q.poll();
                if(temp==board.length*board.length) return res;
                for(int i=1; i<=6; i++){
                    if(temp+i>board.length*board.length) break;
                    int cor[] = getCor(temp+i,board.length);
                    if(!visited[cor[0]][cor[1]]){
                        visited[cor[0]][cor[1]] = true;
                        if(board[cor[0]][cor[1]]==-1){
                            q.add(temp+i);
                        }else{
                            q.add(board[cor[0]][cor[1]]);
                        }
                    }
                }
            }
            res++;
        }
        return -1;
    }
}