class Solution {
    public int maxNumOfMarkedIndices(int[] nums) {
        Arrays.sort(nums);
        int i = 0;
        int j = nums.length/2;
        int res = 0;
        while(i<nums.length/2 && j<nums.length){
            if(nums[i]*2<=nums[j]){
                i++;
                j++;
                res+=2;
                continue;
            }
            j++;
        }
        return res;
    }
}