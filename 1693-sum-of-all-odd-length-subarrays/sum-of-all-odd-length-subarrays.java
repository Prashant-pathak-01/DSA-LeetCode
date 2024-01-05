class Solution {
    public int sumOddLengthSubarrays(int[] arr) {
        int res = 0;
        for(int i=0; i<arr.length; i++){
            for(int j=i; j<arr.length; j+=2){
            int sum = 0;
                for(int k=i; k<=j; k++){
                    sum+=arr[k];
                }
                res+=sum;
            }
        }
        return res;
    }
}