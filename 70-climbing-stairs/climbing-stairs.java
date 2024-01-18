class Solution {
    public int calc(int a,int b, int n){
        if(n==0) return b;
        return calc(b,a+b,n-1);
    }
    public int climbStairs(int n) {
        return calc(1,1,n-1);
    }
}