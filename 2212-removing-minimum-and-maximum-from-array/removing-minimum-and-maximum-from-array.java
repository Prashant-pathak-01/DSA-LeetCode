class Solution {
    public int minimumDeletions(int[] nums) {
        int low = 0;
        int high = 0;
        int max = Integer.MIN_VALUE;
        int min = Integer.MAX_VALUE;
        for(int i=0; i<nums.length; i++){
            if(max<nums[i]){
                max = nums[i];
                high = i;
            }
            if(min>nums[i]){
                min = nums[i];
                low = i;
            }
        }
        return Math.min(Math.max(low,high)+1,Math.min(nums.length-Math.min(low,high),(Math.min(low,high)+1+nums.length-Math.max(low,high))));
    }
}