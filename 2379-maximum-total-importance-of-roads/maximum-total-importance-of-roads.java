class Solution {
    public long maximumImportance(int n, int[][] roads) {
        long arr[] = new long[n];
        for(int i[]:roads){
            arr[i[0]]++;
            arr[i[1]]++;
        }
        long res = 0;
        Arrays.sort(arr);
        for(int i=n; i>=1; i--){
            res=res+arr[i-1]*i;
        }
        return res;
    }
}