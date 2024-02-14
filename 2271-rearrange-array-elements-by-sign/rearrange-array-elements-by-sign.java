class Solution {
    public int[] rearrangeArray(int[] nums) {
        List<Integer> l1 =new ArrayList<>();
        List<Integer> l2 =new ArrayList<>();
        for(int i=0; i<nums.length; i++){
            if(nums[i]<0) l2.add(nums[i]);
            else l1.add(nums[i]);
        }
        int x = 0;
        for(int i=0; i<nums.length; i+=2){
            nums[i] = l1.get(x);
            nums[i+1] = l2.get(x++);
        }
        return nums;
    }
}