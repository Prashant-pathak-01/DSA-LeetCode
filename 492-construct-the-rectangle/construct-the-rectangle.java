class Solution {
    public int[] constructRectangle(int area) {
       int res[] = new int[2];
       int a = (int)Math.sqrt(area);
       while(area%a!=0) a--;
       res[0] = area/a;
       res[1]  =a;
       return res;

    }
}