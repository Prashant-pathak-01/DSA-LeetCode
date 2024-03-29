class Solution {
    public int captureForts(int[] forts) {
        int res= 0;
        int r = -1;
        int l = -1;
        for(int i=0; i<forts.length; i++){
            if(forts[i]==-1) {
                l  = i-1;
                if(r!=-1) res = Math.max(res,Math.abs(l-r));
                r  =-1;
                l = i;
            }
            if(forts[i]==1){
                r = i-1;
                if(l!=-1) res = Math.max(res,Math.abs(l-r));
                l =-1;
                r= i;
            }
        }
        return res;
    }
}