class Solution {
    public long maximumSumOfHeights(int[] heights) {
        long res = 0;
        long sum =0;
        for(int i:heights) sum+=i;
        for(int i=0; i<heights.length; i++){
            int min = heights[i];
            long count =0;
            for(int j=i-1; j>=0; j--){
                if(heights[j]>min){
                    count+=Math.abs(heights[j]-min);
                }else min = heights[j];
            }
            min = heights[i];
            for(int j=i+1; j<heights.length; j++){
                if(heights[j]>min){
                    count+=Math.abs(heights[j]-min);
                }else min = heights[j];
            }
            res = Math.max(res,sum-count);
        }
        return res;
    }
}