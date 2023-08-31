class Solution {
    public int[] twoSum(int[] nums, int target) {
        HashMap<Integer,Integer> storage = new HashMap<>();
        int res[] = new int[2];
        for(int i=0; i<nums.length; i++) {
            if(storage.containsKey(target-nums[i])) {
                res[0] = storage.get(target-nums[i]);
                res[1] = i;
                return res;
            } else{
                storage.put(nums[i],i);
            }
        } 
        return res;
    }
}