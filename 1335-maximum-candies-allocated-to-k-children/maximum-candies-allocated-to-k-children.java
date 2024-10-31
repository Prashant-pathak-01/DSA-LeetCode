class Solution {
    public boolean check(int arr[], int mid, long tar){
        long count =0;
        for(int i=0; i<arr.length; i++){
            count+=(arr[i]/mid);
        }
        return count>=tar;
    }
    public int maximumCandies(int[] candies, long k) {
        int min = 1;
        int max = 0;
        int res= 0;
        for(int i:candies) max = Math.max(max,i);
        while(min<=max){
            int mid = (max+min)/2;
            if(check(candies,mid,k)){
                min = mid+1;
                res = mid;
            }else max = mid-1;
        }
        return res;
    }
}