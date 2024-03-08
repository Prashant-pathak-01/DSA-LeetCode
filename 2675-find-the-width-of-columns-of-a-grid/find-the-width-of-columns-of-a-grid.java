class Solution {
    public int[] findColumnWidth(int[][] grid) {
        int res[] = new int[grid[0].length];
        for(int i=0; i<grid[0].length; i++){
            int temp = Integer.MIN_VALUE;
            for(int j=0; j<grid.length; j++) {
                String str = ""+grid[j][i];
                temp = Math.max(temp,str.length());
            }
            res[i] = temp;
        }
        return res;
    }
}