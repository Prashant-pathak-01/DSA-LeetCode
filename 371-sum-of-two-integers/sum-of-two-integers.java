class Solution {
    public int getSum(int a, int b) {
        if((a&b)==0) return a|b;
        else return getSum((a&b)<<1,a^b);
    }
}