class Solution {
    public int maxEnvelopes(int[][] envelopes) {
        Arrays.sort(envelopes,(a,b)->a[0]==b[0]?b[1]-a[1]:a[0]-b[0]);
        int len = 0;
        int dp[] = new int[envelopes.length];
        for(int i[]:envelopes){
            int indx = Arrays.binarySearch(dp,0,len,i[1]);
            if(indx<0) indx = -(indx+1);
            dp[indx] = i[1];
            if(indx==len) len++;
        }
        return len;
    }
}