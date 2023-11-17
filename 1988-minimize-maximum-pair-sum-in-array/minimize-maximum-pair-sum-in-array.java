class Solution {
    public int minPairSum(int[] nums) {
        int i =0;
        int j =nums.length-1;
        int res= 0;
        Arrays.sort(nums);
        while(i<j){
            res = Math.max(res,nums[i]+nums[j]);
            i++;
            j--;
        }
        return res;
    }
}