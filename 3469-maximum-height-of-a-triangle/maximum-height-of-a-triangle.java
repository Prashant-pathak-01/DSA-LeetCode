class Solution {
    public int maxHeightOfTriangle(int red, int blue) {
        int a1 = (int)Math.sqrt(red);
        int a2 = (int)Math.sqrt(blue);
        int b1  = (int)(-1+Math.sqrt(1+4*blue))/2;
        int b2 = (int)(-1+Math.sqrt(1+4*red))/2;
        int res1 = Math.min(a1,b1)*2;
        int res2 = Math.min(a2,b2)*2;
        if(a1>b1) res1++;
        if(a2>b2) res2++;
        return Math.max(res1,res2);

    }
}