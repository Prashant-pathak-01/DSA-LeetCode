class Solution {
    public long coloredCells(int n) {
        if(n==0) return 0;
        long res =1;
        long temp = 0;
        for(int i=1; i<n; i++){
            temp+=4;
            res = res+temp;
        }
        return res;
    }
}