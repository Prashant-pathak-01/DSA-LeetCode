class Solution {
    public boolean isReachableAtTime(int sx, int sy, int fx, int fy, int t) {
        if(sx==fx && sy==fy  && t==1) return false;
        int temp = Math.min(Math.abs(fx-sx), Math.abs(fy-sy));
        if(fx>sx){
            sx+=temp;
        } else sx-=temp;
        if(fy>sy){
            sy+=temp;
        } else sy-=temp;
        t-=temp;
        temp = 0;
        temp = Math.max(Math.abs(sx-fx),Math.abs(sy-fy));
        return temp<=t;
    }
}