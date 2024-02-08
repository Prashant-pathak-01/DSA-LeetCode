class Solution {
    public int numOfPairs(String[] nums, String target) {
        int res = 0;
        for(int i=0; i<nums.length; i++){
            if(nums[i].length()<=target.length() && nums[i].equals(target.substring(0,nums[i].length()))){
                for(int j=0; j<nums.length; j++){
                    if(i!=j && (nums[i]+nums[j]).equals(target)) res++;
                }
            }
        }
        return res;
    }
}