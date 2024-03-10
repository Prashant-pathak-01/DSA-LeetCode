class Solution {
    public long maximumHappinessSum(int[] happiness, int k) {
        Arrays.sort(happiness);
        long res= 0 ;
        int x=  0;
        for(int i=1; i<=k; i++){
            if(happiness[happiness.length-i]-x>0) res+=happiness[happiness.length-i]-x;
            if(happiness[happiness.length-i]-x==0)  continue;
            x++;
        }
        return res;
    }
}