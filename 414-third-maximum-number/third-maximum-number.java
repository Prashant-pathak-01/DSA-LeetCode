class Solution {
    public int thirdMax(int[] nums) {
        Arrays.sort(nums);
        int count = 0;
        int prev = nums[nums.length-1];
        for(int i=nums.length-1; i>=0; i--){
            if(nums[i]!=prev) {
                count++;
                prev = nums[i];
            }
            if(count==2) return nums[i];
        }
        return nums[nums.length-1];
    }
}