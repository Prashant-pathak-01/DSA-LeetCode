class Solution {
    public double averageWaitingTime(int[][] customers) {
        long wait = 0;
        long sum =customers[0][0];
        for(int i[]:customers){
            if(sum>=i[0]) sum+=i[1];
            else sum = i[0]+i[1];
            wait+=(sum-i[0]);
        }
        return (double)wait/(double)customers.length;
    }
}