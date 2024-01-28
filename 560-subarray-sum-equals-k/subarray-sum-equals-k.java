class Solution {
    public int subarraySum(int[] nums, int k) {
        int sum[] = new int[nums.length];
        sum[0] = nums[0];
        for(int i=1; i<nums.length; i++) {
            sum[i] = sum[i-1]+nums[i];
        } 
        int res = 0;
        for(int i=0; i<nums.length; i++){
            for(int j=i; j<nums.length; j++){
                if(k==sum[j]-sum[i]+nums[i]) res++;
            }
        }
        return res;
    }
}