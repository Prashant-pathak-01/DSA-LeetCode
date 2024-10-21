class Solution {
    public int maxProfit(int[] prices) {
        int res =0;
        int l[] = new int[prices.length];
        int r[] = new int[prices.length];
        l[0] = prices[0];
        r[prices.length-1]  = prices[prices.length-1];
        for(int i=1; i<prices.length; i++) l[i] = Math.min(l[i-1],prices[i]);
        for(int i=prices.length-2; i>=0; i--) r[i] = Math.max(r[i+1],prices[i]);
        for(int i=0; i<prices.length; i++) res = Math.max(res,r[i]-l[i]);
        return res;

    }
}