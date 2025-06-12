class Solution {
    int res[][];
    int count =0;
    public void solve(int len,int x, int y){
        if(len==1) {
            res[x][y] = count;
            count++;
            return;
        }
        solve(len/2,x,y+len/2);
        solve(len/2,x+len/2,y+len/2);
        solve(len/2,x+len/2,y);
        solve(len/2,x,y);
    }
    public int[][] specialGrid(int n) {
        int len = (int)Math.pow(2,n);
        res = new int[len][len];
        count =0;
        solve(len,0,0);
        return res;
    }
}