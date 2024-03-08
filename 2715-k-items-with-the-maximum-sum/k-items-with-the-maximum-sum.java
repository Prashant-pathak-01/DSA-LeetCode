class Solution {
    public int kItemsWithMaximumSum(int numOnes, int numZeros, int numNegOnes, int k) {
        int res= 0 ;
        if(k>0){
            int temp = Math.min(numOnes,k);
            k-=temp;
            res+=temp;
        }
        if(k>0) k-=Math.min(numZeros,k);
        if(k>0){
            int temp = Math.min(numNegOnes,k);
            k-=temp;
            res-=temp;
        }
        return res;
    }
}