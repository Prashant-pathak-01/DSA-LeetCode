class Solution {
    public int subarraySum(int[] nums, int k) {
        int res =0 ;
        int arr[] = new int[nums.length];
        arr[0] = nums[0];
        for(int i=1; i<nums.length; i++) arr[i] = arr[i-1]+nums[i];
        for(int i=0; i<nums.length; i++){
            for(int j =i; j<nums.length; j++){
                if(arr[j]-arr[i]+nums[i]==k) res++;
            }
        } 
        return res;
    }
}