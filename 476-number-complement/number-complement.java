class Solution {
    public int findComplement(int num) {
        int Max = 0;
        int temp = 1;
        int  n = num;
        while(num>0){
            Max+=temp;
            temp*=2;
            num/=2;
        }
        return n^Max;
    }
}