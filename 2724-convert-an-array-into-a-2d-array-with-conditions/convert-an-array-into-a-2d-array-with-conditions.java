class Solution {
    public List<List<Integer>> findMatrix(int[] nums) {
        List<List<Integer>> list = new ArrayList<>();
        Map<Integer,Integer> map = new HashMap<>();
        for(int i=0; i<nums.length; i++) map.put(nums[i],map.getOrDefault(nums[i],0)+1);
        while(map.size()!=0){
            List<Integer> temp= new ArrayList<>();
            for(int i=0; i<nums.length; i++){
                if(!temp.contains(nums[i]) && map.containsKey(nums[i])){
                    temp.add(nums[i]);
                    map.put(nums[i],map.get(nums[i])-1);
                    if(map.get(nums[i])==0) map.remove(nums[i]);
                }
            }
            list.add(new ArrayList<>(temp));
        } 
        return list;
    }
}