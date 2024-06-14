class Solution {
    public int minIncrementForUnique(int[] nums) {
        Arrays.sort(nums);
        int res= 0;
        int min = nums[0];
        for(int i:nums){
            if(i<=min){
                res+=Math.abs(min-i);
                min++;
            }else min = i+1;
        }
        return res;
    }
}