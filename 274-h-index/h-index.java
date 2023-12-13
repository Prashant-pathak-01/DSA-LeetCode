class Solution {
    public int hIndex(int[] citations) {
        Arrays.sort(citations);
        int res = 0;
        for(int i=0; i<citations.length; i++){
            if(citations[i]>=citations.length-i){
                res = Math.max(res,citations.length-i);
            }
        }
        return res;
    }
}