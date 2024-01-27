class Solution {
    public int longestString(int x, int y, int z) {
        int res = z;
        if(x>y || x<y) res+=Math.min(x,y)*2+1;
        else res+=x*2;
        return res*2;
    }
}