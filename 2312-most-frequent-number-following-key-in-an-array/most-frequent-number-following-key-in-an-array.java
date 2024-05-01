class Solution {
    public int mostFrequent(int[] nums, int key) {
        Map<Integer,Integer> map = new HashMap<>();
        for(int i=00; i<nums.length-1; i++){
            if(nums[i]==key) map.put(nums[i+1],map.getOrDefault(nums[i+1],0)+1);
        }
        int res = -1;
        int freq = 0;
        for(int keys:map.keySet()){
            if(map.get(keys)>freq){
                freq = map.get(keys);
                res = keys;
            }
        }
        return res;
    }
}