class Solution {
    public boolean check(int arr[], int tar, int mid){
        int sum =0;
        int days = 1;
        for(int i=0; i<arr.length; i++){
            if(sum+arr[i]>mid){
                days++;
                sum=arr[i];
            }else{
                sum+=arr[i];
            }
        }
        return days<=tar;
    }
    public int shipWithinDays(int[] weights, int days) {
        int max =0;
        int min =Integer.MIN_VALUE;
        for(int i:weights) {
            max+=i;
            min = Math.max(min,i);
        }
        while(min<=max){
            int mid = (min+max)/2;
            if(check(weights,days,mid)){
                max = mid-1;
            }else min = mid+1;
        }
        return min;

    }
}