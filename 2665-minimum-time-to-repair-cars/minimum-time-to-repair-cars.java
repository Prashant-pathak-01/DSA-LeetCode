class Solution {
    public boolean check(int arr[], long mid, int tar){
        long count =0;
        for(int i=0; i<arr.length; i++){
            count+=(long)Math.sqrt(mid/arr[i]);
        }
        return count>=tar;
    }
    public long repairCars(int[] ranks, int cars) {
        long min = 1;
        long max = Long.MAX_VALUE;
        for(int i:ranks) max = Math.min(max,(long)i*cars*cars);
        long res =0;
        while(min<=max){
            long mid = min+(max-min)/2;
            if(check(ranks,mid,cars)){
                res = mid;
                max = mid-1;
            }else min = mid+1;
        }
        return res;
    }
}