class Solution {
    public int[] findErrorNums(int[] nums) {
        Map<Integer,Integer> map = new HashMap<>();
        for(int i:nums) map.put(i,map.getOrDefault(i,0)+1);
        int res[] = new int[2];
        for(int i=0; i<nums.length; i++){
            if(res[1]==0 && !map.containsKey(i+1)) res[1] = i+1;
            if(map.get(nums[i])==2) res[0] = nums[i];
        }
        return res;
    }
}