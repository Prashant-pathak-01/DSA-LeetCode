class Solution {
    public int[] topKFrequent(int[] nums, int k) {
        Map<Integer,Integer> map = new HashMap<>();
        for(int i=0; i<nums.length;  i++){
            if(map.containsKey(nums[i])){
                map.put(nums[i],map.get(nums[i])+1);
            }else{
                map.put(nums[i],1);
            }
        }
        List<Integer> list = new ArrayList<>(map.keySet());
        Collections.sort(list,(a,b)->Integer.compare(map.get(b),map.get(a)));
        int res[] = new int[k];
        for(int j=0;j<k; j++){
            res[j] = list.get(j);
        }

        return res;
    }
}