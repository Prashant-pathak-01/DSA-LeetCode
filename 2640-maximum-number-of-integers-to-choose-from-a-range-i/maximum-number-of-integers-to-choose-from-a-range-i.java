class Solution {
    public int maxCount(int[] banned, int n, int maxSum) {
        Arrays.sort(banned);
        int x = 0;
        int res= 0;
        for(int i=1; i<=n; i++){
            while(x>0 && x<banned.length && banned[x]==banned[x-1]) x++;
            if(x<banned.length && banned[x]==i) {
                x++;
                continue;
            }
            if(maxSum-i<0) break;
            res++;
            maxSum-=i;
        }
        return res;

    }
}