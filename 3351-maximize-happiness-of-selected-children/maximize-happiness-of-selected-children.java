class Solution {
    public long maximumHappinessSum(int[] happiness, int k) {
        Arrays.sort(happiness);
        long res= 0 ;
        int x=  0;
        for(int i=happiness.length-1; i>=0; i--){
            if(k==0) break;
            k--;
            if(happiness[i]-x>0)res+=happiness[i]-x;
            if(happiness[i]-x==0)  continue;
            x++;
        }
        return res;
    }
}