class Solution {
    public boolean checkPossibility(int[] nums) {
        boolean flag = true;
        flag = true;
        for(int i=0; i<nums.length-1; i++) {
            if(nums[i]>nums[i+1]) {
                if(flag){
                    if(i>0 && nums[i-1]>nums[i+1]) nums[i+1] = nums[i];
                   flag = false; 
                }else return false;
            }
        }
        return true;
    }
}