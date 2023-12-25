class Solution {
    public int maxSubarrayLength(int[] nums, int k) {
        if(k==0) return k;
        Map<Integer,Integer> map = new HashMap<>();
        int i = 0;
        int j = 0;
        int res = 0;
        while(i<nums.length){
            if(!map.containsKey(nums[i])){
                map.put(nums[i],1);
            }else{
                map.put(nums[i],map.get(nums[i])+1);
            }
                while(map.get(nums[i])>k){
                    map.put(nums[j],map.get(nums[j])-1);
                    j++;
                }

            res= Math.max(res,i-j+1);
            i++;
        }

            return res;
    }
}