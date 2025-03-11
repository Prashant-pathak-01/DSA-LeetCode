class Solution {
    public int[] findRightInterval(int[][] intervals) {
        int arr[][] = new int[intervals.length][3];
        for(int i=0; i<intervals.length; i++){
            arr[i][0] = intervals[i][0];
            arr[i][1] = intervals[i][1];
            arr[i][2] = i;
        }
        Arrays.sort(arr,(a,b)->a[0]-b[0]);
        int res[] = new int[intervals.length];
        for(int i=0; i<arr.length; i++){
            int tar = arr[i][1];
            int l = 0;
            int r = arr.length-1;
            int mid;
            int ans = -1;
            while(l<=r){
                mid = (l+r)/2;
                if(arr[mid][0]>=tar){
                    ans = arr[mid][2];
                    r = mid-1;
                }else l = mid+1;
            }
            res[arr[i][2]] = ans;
        }
        return res;
    }
}