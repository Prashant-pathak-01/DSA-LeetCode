class Solution {
    public int countCompleteSubarrays(int[] nums) {
        Set<Integer> set = new HashSet<>();
        for(int i=0; i<nums.length; i++){
            set.add(nums[i]);
        }
        int count = set.size();
        set.clear();
        Map<Integer,Integer> map = new HashMap<>();
        int res = 0;
        int j =0;
        for(int i=0; i<nums.length; i++){
            if(map.containsKey(nums[i])){
                map.put(nums[i],map.get(nums[i])+1);
                set.add(nums[i]);
                
            }else{
                map.put(nums[i],1);
                set.add(nums[i]);
            }
            while(set.size()>=count){
                res+=nums.length-i;
                map.put(nums[j],map.get(nums[j])-1);
                if(map.get(nums[j])==0) set.remove(nums[j]);
                j++;
            }
        }
        return res;

    }
}