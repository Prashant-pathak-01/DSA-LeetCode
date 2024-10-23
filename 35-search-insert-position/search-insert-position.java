class Solution {
    public int searchInsert(int[] nums, int target) {
        if(target<=nums[0] ) return 0;
        if(target>nums[nums.length-1] ) return nums.length;
        int i =0;
        int j =nums.length-1;
        while(i<j){
            int mid = (i+j)/2;
            if(nums[mid]==target) return mid;
            else if(nums[mid]>target) j = mid;
            else i = mid+1;
        }
        return i;
    }
}