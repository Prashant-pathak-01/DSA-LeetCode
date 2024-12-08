class Solution {
    public int smallestNumber(int n) {
        int count =0;
        for(int i=0; i<32; i++){
            if(((n>>i)&1)==1) count = i+1;
        }
        int res = 0;
        while(count-->0){
            res = res<<1;
            res = res|1;
        }
        return res;
    }
}