class Solution {
    public int reverse(int x) {
        int res =0 ;
        boolean flag=x>=0?false:true;
        x=Math.abs(x);
        while(x>0){
            int temp = x%10;
            x/=10;
            if(res>(Integer.MAX_VALUE-temp)/10) return 0;
            res*=10;
            res+=temp;
        }
        res*=flag?-1:1;
        return res;
    }
}