class Solution {
    public int countSubarrays(int[] nums, int k) {
        int index = -1;
        for(int i=0; i<nums.length; i++) {
            if(nums[i]==k) {
                nums[i] =0;
                index =i;
            }else nums[i]=nums[i]>k?1:-1;
        }
        if(index==-1) return 0;
        int res =0;
        int sum =0;
        Map<Integer,Integer> map = new HashMap<>();
        map.put(0,1);
        for(int i=0; i<nums.length; i++){
            sum+=nums[i];
            if(index<=i) res+=map.getOrDefault(sum,0)+map.getOrDefault(sum-1,0);
            else map.put(sum,map.getOrDefault(sum,0)+1);
        }
        return res;


    }
}