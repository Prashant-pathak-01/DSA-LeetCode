class Solution {
    public int findDuplicate(int[] nums) {
        HashMap<Integer,Integer> res = new HashMap<>();
        for(int i=0; i<nums.length; i++) {
            if(res.containsKey(nums[i])) return nums[i];
            res.put(nums[i],1);
        }
        return 0;
    }
}