class Solution {
    Map<Integer,List<Integer>> map ;
    public Solution(int[] nums) {
        map = new HashMap<>();
        for(int i=0; i<nums.length; i++){
            List<Integer> list= map.getOrDefault(nums[i],new ArrayList<>());
            list.add(i);
            map.put(nums[i],list);
        }
    }
    
    public int pick(int target) {
        return map.get(target).get((int)(Math.random()*map.get(target).size()));
    }
}
