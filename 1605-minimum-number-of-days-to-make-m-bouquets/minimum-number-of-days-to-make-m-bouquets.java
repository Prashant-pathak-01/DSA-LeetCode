class Solution {
    public boolean isValid(int arr[],int day, int m, int k){
        int count =0;
        for(int i=0; i<arr.length; i++){
            if(arr[i]<=day) count++;
            else count =0;
            if(count==k) {
                m--;
                count =0;
            }
            if(m==0) return true;
        }
        return false;
    }
    public int minDays(int[] bloomDay, int m, int k) {
        int min =1;
        int max = 1;
        for(int i:bloomDay) max = Math.max(max,i);
        if(bloomDay.length<(long)m*k) return -1;
        int res = 0;
        while(min<=max){
            int mid = (max+min)/2;
            boolean check = isValid(bloomDay,mid,m,k);
            if(check) {
                res = mid;
                max = mid-1;
            }else min = mid+1;
            // System.out.println(check+" "+mid);
        }
        return res;
    }
}