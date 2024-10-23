class Solution {
    public int maxProfit(int[] prices) {
        int res= 0;
        int sum = 0;
        int max =prices[0];
        for(int i=0; i<prices.length; i++){
            if(prices[i]<=max){
                max = prices[i];
            }else{
                res+=(max-prices[i]);
                max =prices[i];
            }
        }
        return res*-1;
    }
}