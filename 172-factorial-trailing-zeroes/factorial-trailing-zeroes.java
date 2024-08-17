class Solution {
    public int trailingZeroes(int n) {
        int res= 0;
        for(int i=5; i<=n; i+=5){
            int count =0 ;
            int temp =i;
            while(temp%5==0) {
                temp/=5;
                count++;
            }
            res+=count;
        }
        return res;
    }
}