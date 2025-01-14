class Solution {
    public int maxNonOverlapping(int[] nums, int target) {
        Set<Integer> set = new HashSet<>();
        int sum =0;
        int res= 0;
        set.add(0);
        for(int i=0; i<nums.length; i++){
            sum+=nums[i];
            if(set.contains(sum-target)){
                res++;
                sum =0;
                set.clear();
                set.add(0);
            }else set.add(sum);
        }
        return res;
    }
}