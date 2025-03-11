class Solution {
    public long minEnd(int n, int x) {
        long res = x;
        long count =0;
        n--;
        while(n>0){
            while((res&(1l<<count))!=0) count++;
            res = res | ((n&1l)<<count);
            count++;
            n = n>>1;
        }
        return res;
    }
}