class Solution {
    public String optimalDivision(int[] nums) {
        if(nums.length==1) return nums[0]+"";
        if(nums.length==2) return nums[0]+"/"+nums[1];
        StringBuilder str = new StringBuilder();
        for(int i=1; i<nums.length; i++) {
            str = str.append(nums[i]);
            if(i<nums.length-1) str.append("/");
        }
        return nums[0]+"/("+str+")";
    }
}