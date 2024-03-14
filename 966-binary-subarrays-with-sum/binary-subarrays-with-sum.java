class Solution {
    public int numSubarraysWithSum(int[] nums, int goal) {
        int res=0 ;
        int presum[] = new int[nums.length];
        presum[0] = nums[0];
        for(int i=1; i<nums.length; i++) presum[i] = presum[i-1]+nums[i];
        for(int i=0; i<nums.length; i++){
            for(int j=i; j<nums.length; j++){
                if(presum[j]-presum[i]+nums[i]==goal) res++;
            }
        }
        return res;
    }
}