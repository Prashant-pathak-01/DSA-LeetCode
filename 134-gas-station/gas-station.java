class Solution {
    public int canCompleteCircuit(int[] gas, int[] cost) {
        int gasSum = 0;
        int costSum =0;
        for(int i:gas) gasSum+=i;
        for(int i:cost) costSum+=i;
        if(costSum>gasSum) return -1;
        int sum =0;
        int res= 0;
        for(int i=0; i<gas.length; i++){
            sum += gas[i]-cost[i];
            if(sum<0) {
                res = i+1;
                sum = 0;    
            }
        }
        return res;
    }
}