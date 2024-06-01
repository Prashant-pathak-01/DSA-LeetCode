class Solution {
    public int minOperations(int[] nums) {
        Arrays.sort(nums);
        int len = 1;
        for(int i=1; i<nums.length; i++) if(nums[i]!=nums[i-1]) nums[len++] = nums[i];
        int res= 0;
        for(int i=0,j=0; i<len; i++){
            while(j<len && nums[j]<=nums[i]+nums.length-1) j++;
            res = Math.max(res,j-i);
        }
        return nums.length-res;
    }
}