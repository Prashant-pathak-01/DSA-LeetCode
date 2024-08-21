class Solution {
    public int maxIceCream(int[] costs, int coins) {
        Arrays.sort(costs);
        int i=0;
        int count = 0;
        while(i<costs.length && coins>=costs[i]){
            count++;
            coins-=costs[i];
            i++;
        }
        return count;
    }
}