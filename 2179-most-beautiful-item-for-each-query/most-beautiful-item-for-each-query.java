class Solution {
    public int check(int arr[][], int tar){
        int start = 0;
        int end = arr.length-1;
        int res =0;
        while(start<=end){
            int mid = start+(end-start)/2;
            if(arr[mid][0]<=tar) {
                res = arr[mid][1];
                start = mid+1;
            }
            else end = mid-1;
        }
        return res;
    }
    public int[] maximumBeauty(int[][] items, int[] queries) {
        Arrays.sort(items,(a,b)->a[0]==b[0]?a[1]-b[1]:a[0]-b[0]);
        for(int i=1; i<items.length; i++){
            items[i][1] = Math.max(items[i-1][1],items[i][1]);
        }
        int res[] = new int[queries.length];
        for(int i=0; i<queries.length; i++){
            res[i] =check(items,queries[i]);
        }
        return res;
    }
}