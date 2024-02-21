class Solution {
    public int maximumStrongPairXor(int[] nums) {
        int res = 0;
        for(int i=0; i<nums.length-1; i++){
            for(int j=i+1; j<nums.length; j++){
                if(Math.abs(nums[i]-nums[j])<=Math.min(nums[i],nums[j])){
                    res = Math.max(res,nums[i]^nums[j]);
                }
            }
        }
        return res;
    }
}