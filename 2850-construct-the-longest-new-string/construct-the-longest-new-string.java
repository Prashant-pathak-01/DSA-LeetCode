class Solution {
    public int longestString(int x, int y, int z) {
        return Math.max(x,y)==Math.min(x,y)?(z+x+y)*2:((Math.min(x,y)*2+1)+z)*2;
    }
}