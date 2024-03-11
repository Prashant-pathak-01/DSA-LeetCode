class Solution {
    public int majorityElement(int[] nums) {
        int point  =1;
        int res= nums[0] ;
        for(int i=1; i<nums.length; i++){
            if(res==nums[i]) point++;
            else if(res!=nums[i]) point--;
            if(point<0) {
                res = nums[i];
                point = 1;
            }
        }
        return res;
    }
}