class Solution {
    public void solve(int dp[]){
        PriorityQueue<Long> pq = new PriorityQueue<>();
        Set<Long> set = new HashSet<>();
        pq.add(1l);
        set.add(1l);
        int index= 1;
        while(index<dp.length){
            long temp = pq.poll();
            dp[index++] = (int)temp;
            long a = temp*2;
            long b = temp*3;
            long c = temp*5;
            if(set.add(a)) pq.add(a);
            if(set.add(b)) pq.add(b);
            if(set.add(c)) pq.add(c);
        }

    }
    public int nthUglyNumber(int n) {
        int dp[] = new int[n+1];
        solve(dp);
        //System.out.println(Arrays.toString(dp));
        return dp[n];
    }
}