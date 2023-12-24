class Solution {
    public int maximizeSquareArea(int m, int n, int[] hFences, int[] vFences) {
        int a1[] = new int[hFences.length+2];
        int a2[] = new int[vFences.length+2];
        for(int i=0; i<hFences.length; i++){
            a1[i] = hFences[i];
        }
        a1[hFences.length] = 1;
        a1[hFences.length+1] = m;

        for(int i=0; i<vFences.length; i++){
            a2[i] = vFences[i];
        }
        a2[vFences.length] = 1;
        a2[vFences.length+1] = n;

        Set<Integer> set = new HashSet<>();
        for(int i=0; i<a1.length; i++){
            for(int j=0; j<a1.length; j++){
                if(i!=j) set.add(Math.abs(a1[i]-a1[j]));
            }
        }

        long res=  -1;
        int mod = 1000000007;
        for(int i=0; i<a2.length; i++){
            for(int j=0; j<a2.length; j++){
                if(set.contains(Math.abs(a2[i]-a2[j]))) res = Math.max(res,Math.abs(a2[i]-a2[j]));  
            }
        }
        return res==-1?-1:(int)((res*res)%mod);

    }
}