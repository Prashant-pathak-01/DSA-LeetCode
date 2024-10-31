class Solution {
    public boolean check(int arr[], int mid, int n){
        int count =0;
        for(int i=0; i<arr.length; i++){
            count+=(arr[i]+mid-1)/mid;
        }
        return count<=n;
    }
    public int minimizedMaximum(int n, int[] quantities) {
        int min = 1;
        int max =Integer.MIN_VALUE;
        for(int i : quantities) max  = Math.max(max,i);
        int res= -1;
        while(min<=max){
            int mid = (max+min)/2;
            if(check(quantities,mid,n)){
                res = mid;
                max = mid-1;
            }else min = mid+1;
        }
        return res;
    }
}