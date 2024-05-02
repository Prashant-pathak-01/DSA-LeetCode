class Solution {
    public int findMaxK(int[] nums) {
        Arrays.sort(nums);
        for(int i=nums.length-1; i>=0; i--) {
            int temp = nums[i]*-1;
            for(int j = 0; j<=i; j++) {
                if(nums[j]==temp) {
                    return nums[j]*-1;
                }

            }
        }
        return -1;
    }
}