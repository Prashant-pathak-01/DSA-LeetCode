class Solution {
    public long maxTaxiEarnings(int n, int[][] rides) {
        Arrays.sort(rides,(a,b)->a[1]-b[1]);
        TreeMap<Integer,Long> tMap = new TreeMap<>();
        tMap.put(0,0l);
        for(int []ride:rides){
            long curr = tMap.floorEntry(ride[0]).getValue()+(ride[1]-ride[0]+ride[2]);
            if(curr>tMap.lastEntry().getValue()){
                tMap.put(ride[1],curr);
            }
        }
        return tMap.lastEntry().getValue();
    }
}