class Solution {
    public int maxFrequency(int[] nums, int k) {
        Arrays.sort(nums);
        int res =0 ;
        long sum = 0;
        int j = 0;
        for(int i=0; i<nums.length; i++){
            sum+=nums[i];
            long req = (long)nums[i]*(long)(i+1-j);
            if(req-sum<=k) res = Math.max(res,i+1-j);
            else {
                while(j<i && req-sum>k) {
                    sum-=nums[j];
                    req-=nums[i];
                    j++;
                }
            }
        }
        return res;
    }
}