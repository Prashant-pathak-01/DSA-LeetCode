class Solution {
    public void dfs(int i, int stones[][], boolean visited[]){
        for(int x =0; x<stones.length; x++){
            if(!visited[x] && i!=x && (stones[i][0]==stones[x][0] || stones[i][1]==stones[x][1])){
                visited[x] = true;
                dfs(x,stones,visited);
            }
        }
    }
    public int removeStones(int[][] stones) {
        boolean visited[] = new boolean[stones.length];
        int count = 0;
        for(int i=0; i<stones.length; i++){
            if(!visited[i]){
                count++;
                visited[i] = true;
                dfs(i,stones,visited);
            }
        }
        return stones.length-count;
    }
}