class Solution {
    public int getLargestOutlier(int[] nums) {
        int sum = 0;
        Map<Integer, Integer> map = new HashMap<>();
        //Arrays.sort(nums);
        int res = Integer.MIN_VALUE;
        for(int i:nums){
            sum+=i;
            map.put(i, map.getOrDefault(i,0)+1);
        }
        for(int i=nums.length-1; i>=0; i--) {
            //System.out.println((sum-nums[i])+" "+nums[i]);
            if((sum-nums[i])%2==0 && map.containsKey((sum-nums[i])/2)) {
                if(nums[i]==(sum-nums[i])/2) {
                    if(map.get((sum-nums[i])/2)>1) res = Math.max(res,nums[i]);
                }
                else {
                    
                    res = Math.max(res,nums[i]);
                }
            }
        }
        return res;
    }
}