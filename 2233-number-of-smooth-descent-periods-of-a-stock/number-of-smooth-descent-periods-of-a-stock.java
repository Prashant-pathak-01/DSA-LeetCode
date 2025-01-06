class Solution {
    public long getDescentPeriods(int[] prices) {
        long res =0;
        int prev = -1;
        int count =0;
        for(int i=0; i<prices.length; i++){
            if(prices[i]==prev-1) count++;
            else count = 1;
            prev = prices[i];
            res+=count;
        }
        return res;
    }
}