class Solution {
    public int firstMissingPositive(int[] nums) {
        boolean flag  = true;
        for(int i=0; i<nums.length; i++){
            if(nums[i]==1) flag = false;
            if(nums[i]<=0) nums[i] =1;
        }
        if(flag) return 1;
        for(int i=0; i<nums.length; i++){
            int temp = Math.abs(nums[i]);
            if(temp<=nums.length){
                if(nums[temp-1]>0) nums[temp-1] *=-1;
            }
        }
        for(int i=0; i<nums.length; i++) if(nums[i]>=0) return i+1;
        return nums.length+1;
    }
}