class Solution {
    public boolean check(int arr[], int mid, int tar){
        int count =0;
        for(int i=0; i<arr.length; i++){
            count+=(arr[i]+mid-1)/mid;
        }
        return tar>=count;
    }
    public int smallestDivisor(int[] nums, int threshold) {
        int min = 1;
        int max = 0;
        int res= 0;
        for(int i:nums) max = Math.max(max,i);
        while(min<=max){
            int mid = (min+max)/2;
            if(check(nums,mid,threshold)){
                res = mid;
                max = mid-1;
            }else min = mid+1;
        }
        return res;
    }
}