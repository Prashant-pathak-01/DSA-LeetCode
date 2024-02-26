class Solution {
    public int numWaterBottles(int numBottles, int numExchange) {
        int res=  numBottles;
        while(numBottles>=numExchange){
            int temp = numBottles%numExchange;
            res+=numBottles/numExchange;
            numBottles/=numExchange;
            numBottles+=temp;
        }
        return res;
    }
}