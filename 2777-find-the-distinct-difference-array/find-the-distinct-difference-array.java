class Solution {
    public int[] distinctDifferenceArray(int[] nums) {
        int []prefix = new int[nums.length];
        Set<Integer> pre = new HashSet<>();
        int []suffix = new int[nums.length+1];
        Set<Integer> suff = new HashSet<>();
        for(int i=0; i<nums.length; i++){
            pre.add(nums[i]);
            prefix[i] = pre.size();
            suff.add(nums[nums.length-1-i]);
            suffix[nums.length-i-1] = suff.size();
        }
        for(int i=0; i<nums.length; i++){
            nums[i] = prefix[i]-suffix[i+1];
        }
        return nums;

    }
}