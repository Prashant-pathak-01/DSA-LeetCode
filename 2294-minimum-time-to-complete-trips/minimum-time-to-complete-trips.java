class Solution {
    public boolean check(int arr[], long mid, int tar){
        long count =0;
        for(int i=0; i<arr.length; i++){
            count+=(mid/arr[i]);
        }
        return count>=tar;
    }
    public long minimumTime(int[] time, int totalTrips) {
        long min = 1;
        long max = Integer.MAX_VALUE;
        long res= 0;
        for(int i:time) max = Math.min(max,i);
        max*=totalTrips;
        while(min<=max){
            long mid = (min+max)/2;
            if(check(time,mid,totalTrips)){
                res = mid;
                max = mid-1;
            }else min = mid+1;
        }
        return res;
    }
}