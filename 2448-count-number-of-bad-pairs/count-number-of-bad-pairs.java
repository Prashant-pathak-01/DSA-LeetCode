class Solution {
    public long countBadPairs(int[] nums) {
        Map<Integer,Integer> map = new HashMap<>();
        long res =0;
        for(int i=0; i<nums.length; i++){
            int temp = map.getOrDefault(nums[i]-i,0);
            res+=i-temp;
            map.put(nums[i]-i,temp+1);
        }
        return res;
    }
}