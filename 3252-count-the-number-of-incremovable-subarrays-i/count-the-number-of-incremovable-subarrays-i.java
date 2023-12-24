class Solution {
    public int incremovableSubarrayCount(int[] nums) {
        int res = 0;
        for(int i=0; i<nums.length; i++){
            for(int j=i; j<nums.length; j++){
                if(isIncreasing(nums,i,j)) res++;
            }
        }
        return res;
    }
    public boolean isIncreasing(int nums[] , int l, int h){
        for(int i=0; i<l-1; i++){
            if(nums[i]>=nums[i+1]) return false;
        }
        if(l>0 && h<nums.length-1 && nums[l-1]>=nums[h+1]){
            return false;
        }
        for(int i=h+1; i<nums.length-1; i++){
            if(nums[i]>=nums[i+1]) return false;
        }
        return true;
    }
}