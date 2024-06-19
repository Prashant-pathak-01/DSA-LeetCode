class Solution {
    public int maxProfitAssignment(int[] difficulty, int[] profit, int[] worker) {
        int max= 0;
        for(int i:difficulty) max = Math.max(i,max);
        int arr[] = new int[max+1];
        for(int i=0; i<difficulty.length; i++) arr[difficulty[i]] = Math.max(arr[difficulty[i]],profit[i]);
        for(int i=1; i<arr.length; i++) arr[i] = Math.max(arr[i],arr[i-1]);
        int res = 0;
        for(int i:worker) {
            if(i>max) res+=arr[max];
            else res+=arr[i];
        }  
        return res;
    }
}