class Solution {
    public int maxProfit(int[] prices) {
        int res =0;
        int min = prices[0];
        int max =prices[0];
        for(int i=0;  i<prices.length; i++){
            max = prices[i];
            res = Math.max(res,max-min);
            min = Math.min(min,prices[i]);
        } 
        return res;
    }
}