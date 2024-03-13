class Solution {
    public int pivotInteger(int n) {
        int arr[] = new int[n];
        int sum = 0;
        for(int i=0; i<n; i++) {
            arr[i] = i+1;
            sum = sum + arr[i];
        }
        int c =0;
        for(int i=0; i<n; i++) {
            c = c+ arr[i];
            sum = sum - i;
            if(c == sum) {
                return arr[i];
            }
        }

        return -1;


    }
}