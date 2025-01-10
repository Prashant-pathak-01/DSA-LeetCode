class Solution {
    public int minStartValue(int[] nums) {
        for(int i=1; i<nums.length; i++){
            nums[i]+=nums[i-1];
        }
        Arrays.sort(nums);
        // System.out.println(Arrays.toString(nums));
        return nums[0]>0?1:nums[0]*-1+1;
    }
}