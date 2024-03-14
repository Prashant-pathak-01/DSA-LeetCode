class Solution {
    public int numSubarraysWithSum(int[] nums, int goal) {
        int res=0 ;
        int presum[] = new int[nums.length+1];
        presum[0] = 1;
        int sum = 0;
        for(int i:nums){
            sum+=i;
            if(sum>=goal) res+=presum[sum-goal];
            presum[sum]++;
        }
        return res;
    }
}