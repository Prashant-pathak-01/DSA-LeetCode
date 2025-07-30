class Solution {
    public int calculateWays(int total,int i, List<Integer> list, int dp[][]){
        if(i>=list.size()) return 0;
        if(total==0) return 1;
        else if(total<0) return 0;
        if(dp[total][i]!=-1) return dp[total][i];
        int take  =0;
        if(total>=list.get(i)) take = calculateWays(total-list.get(i),i,list,dp);
        int nottake = calculateWays(total,i+1,list,dp);
        dp[total][i] = take+nottake;
        return dp[total][i];
    }
    public List<Integer> findCoins(int[] numWays) {
        List<Integer> list = new ArrayList<>();
        for(int i=0; i<numWays.length; i++){
            int dp[][] = new int[i+2][list.size()];
            for(int j[]:dp) Arrays.fill(j,-1);
            int temp = calculateWays(i+1,0,list,dp);
            if(temp==numWays[i]-1) list.add(i+1);
            else if(temp!=numWays[i]) return new ArrayList<>();
        }
        return list;
    }
}