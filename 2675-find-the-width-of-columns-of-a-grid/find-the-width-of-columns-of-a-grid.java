class Solution {
    public int[] findColumnWidth(int[][] grid) {
        int res[] = new int[grid[0].length];
        for(int i=0; i<grid[0].length; i++){
            int temp = Integer.MIN_VALUE;
            for(int j=0; j<grid.length; j++) {
                temp = Math.max(temp,(""+grid[j][i]).length());
            }
            res[i] = temp;
        }
        return res;
    }
}