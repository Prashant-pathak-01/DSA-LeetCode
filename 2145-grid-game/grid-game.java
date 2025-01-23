class Solution {
    public long gridGame(int[][] grid) {
        long sum1 = 0l;
        for(int i=0; i<grid[0].length; i++){
            sum1+=grid[1][i];
        }
        long sum2 = 0l;
        long res = Long.MAX_VALUE;
        for(int i=grid[0].length-1; i>=0; i--){
            sum1-=grid[1][i];
            res = Math.min(res,Math.max(sum1,sum2));
            sum2+=grid[0][i];
        }
        return res;

    }
}