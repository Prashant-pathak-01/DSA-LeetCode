class Solution {
    public int firstMissingPositive(int[] nums) {
        int arr[] = new int[nums.length+1];
        for(int i=0; i<nums.length; i++){
            if(nums[i]>0 && nums[i]<=nums.length+1){
                arr[nums[i]-1] = 1;
            }
        }
        for(int i=0; i<arr.length; i++) if(arr[i]==0) return i+1;
        return nums.length+1;
    }
}