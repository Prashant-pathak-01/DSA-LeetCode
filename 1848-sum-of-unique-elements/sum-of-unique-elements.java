class Solution {
    public int sumOfUnique(int[] nums) {
        int res =0;
        Map<Integer,Integer> map = new HashMap<>();
        for(int i=0; i<nums.length; i++) map.put(nums[i],map.getOrDefault(nums[i],0)+1);
        for(Map.Entry<Integer,Integer> key: map.entrySet()) if(key.getValue()==1) res+=key.getKey();
        return res;
    }
}