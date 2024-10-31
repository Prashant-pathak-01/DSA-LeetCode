class Solution {
    public boolean check(int arr[], int h, int mid){
        long count =0;
        for(int i=0; i<arr.length; i++){
            long temp = arr[i]+mid-1;
            count+=temp/(long)mid;
        }
        return count<=h;
    }
    public int minEatingSpeed(int[] piles, int h) {
        int min = 1;
        int max = 0;
        for(int i:piles) max = Math.max(i,max);
        int res = 0;
        while(min<=max){
            long mid = (min+max)/2;
            if(check(piles,h,(int)mid)){
                res = (int)mid;
                max = (int)mid-1;
            }else min = (int)mid+1;
        }
        return res;
    }
}