class Solution {
    public int[] productExceptSelf(int[] nums) {
        int lp[] = new int[nums.length];
        int rp[] = new int[nums.length];
        lp[0] = nums[0];
        rp[rp.length-1] = nums[rp.length-1];
        for(int i=1; i<nums.length; i++){
            lp[i] = lp[i-1]*nums[i];
        }
        for(int i=nums.length-2; i>=0; i--){
            rp[i] = rp[i+1]*nums[i];
        }
        nums[0] =  rp[1];
        nums[nums.length-1] =  lp[lp.length-2];
        for(int i=1; i<nums.length-1; i++){
            nums[i] = rp[i+1]*lp[i-1];
        }
        return nums;

    }
}