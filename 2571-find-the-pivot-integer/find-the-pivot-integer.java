class Solution {
    public int pivotInteger(int n) {
        int rsum = (n*(n+1))/2;
        int lsum = 0;
        int i = 1;
        while(lsum<=rsum){
            lsum+=i;
            if(lsum==rsum) return i;
            rsum-=i;
            i++;
        }

        return -1;
    }
}