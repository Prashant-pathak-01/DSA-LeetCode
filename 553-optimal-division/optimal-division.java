class Solution {
    public String optimalDivision(int[] nums) {
        if(nums.length==1) return nums[0]+"";
        if(nums.length==2) return nums[0]+"/"+nums[1];
        String str = "";
        for(int i=1; i<nums.length; i++) {
            str = str+nums[i];
            if(i<nums.length-1) str+="/";
        }
        return nums[0]+"/("+str+")";
    }
}