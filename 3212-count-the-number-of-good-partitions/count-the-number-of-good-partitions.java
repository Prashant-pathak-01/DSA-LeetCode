class Solution {
    public int numberOfGoodPartitions(int[] nums) {
        Map<Integer,Integer> map = new HashMap<>();
        for(int i=0; i<nums.length; i++){
            map.put(nums[i],i);
        }
        int res = 1;
        int mod = 1000000007;
        for(int i=0, j=0; i<nums.length; i++){
            res = i>j?(res*2)%mod:res;
            j = Math.max(j,map.get(nums[i]));
        }
        return res;
    }
}