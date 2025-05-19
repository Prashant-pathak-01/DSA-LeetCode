class Solution {
    public int countCoveredBuildings(int n, int[][] buildings) {
        int l[] = new int[n+1];
        int r[] = new int[n+1];
        int t[] = new int[n+1];
        int b[] = new int[n+1];
        Arrays.fill(b,Integer.MAX_VALUE);
        Arrays.fill(l,Integer.MAX_VALUE);
        for(int i=0; i<buildings.length; i++){
            t[buildings[i][0]] = Math.max(t[buildings[i][0]],buildings[i][1]);
            b[buildings[i][0]] = Math.min(b[buildings[i][0]],buildings[i][1]);
            r[buildings[i][1]] = Math.max(r[buildings[i][1]],buildings[i][0]);
            l[buildings[i][1]] = Math.min(l[buildings[i][1]],buildings[i][0]);
        }
        int res= 0;
        for(int i=0; i<buildings.length; i++){
            if(l[buildings[i][1]]<buildings[i][0] && r[buildings[i][1]]>buildings[i][0] && t[buildings[i][0]]>buildings[i][1] &&  b[buildings[i][0]]<buildings[i][1] ) res++;
        }
        return res;
    }
}