class Solution {
    public int maxProfitAssignment(int[] difficulty, int[] profit, int[] worker) {
        int maxDiff = 0;
        for (int d : difficulty) {
            maxDiff = Math.max(maxDiff, d);
        }

        int[] maxProfit = new int[maxDiff + 1];
        for (int i = 0; i < difficulty.length; i++) {
            maxProfit[difficulty[i]] = Math.max(maxProfit[difficulty[i]], profit[i]);
        }

        for (int i = 1; i <= maxDiff; i++) {
            maxProfit[i] = Math.max(maxProfit[i], maxProfit[i - 1]);
        }

        int totalProfit = 0;
        for (int ability : worker) {
            if (ability > maxDiff) {
                totalProfit += maxProfit[maxDiff];
            } else {
                totalProfit += maxProfit[ability];
            }
        }

        return totalProfit;
    }
}