class Solution {
    public int[] createTargetArray(int[] nums, int[] index) {
        List<Integer> list = new ArrayList<>();
        for(int i=0; i<index.length; i++){
            list.add(index[i],nums[i]);
        }
        for(int i=0; i<nums.length; i++) nums[i] = list.get(i);
        return nums;
    }
}