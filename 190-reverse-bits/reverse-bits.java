public class Solution {
    // you need treat n as an unsigned value
    public int reverseBits(int n) {
        int res=0;
        int c = 32;
        while(c-->0){
            int a = n&1;
            res = res<<1;
            n = n>>1;
            if(a==1) res++;
        }
        return res;
    }
}