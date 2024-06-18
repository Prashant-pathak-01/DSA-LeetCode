class Solution {
    // int MOD = (int)1e9+7;
    public int maxSum(int[] arr, int[] brr) {
        int i = 0;
        int j = 0;
        long res = 0;

        long sum1 = 0;
        long sum2 = 0;
        while(i < arr.length && j < brr.length){
            if(arr[i] < brr[j]){
                sum1 += arr[i];
                i++;
            }
            else if(arr[i] > brr[j]){
                sum2 += brr[j++];
            }
            else{
                res += Math.max(sum1 , sum2) + arr[i];
                i++;
                j++;
                sum1 = 0;
                sum2 = 0;
            }
        }

        while(i < arr.length){
            sum1 += arr[i++];
        }
        while(j < brr.length){
            sum2 += brr[j++];
        }

        res += Math.max(sum1 , sum2);
        return (int) (res % (1e9 + 7)) ;
    }
}