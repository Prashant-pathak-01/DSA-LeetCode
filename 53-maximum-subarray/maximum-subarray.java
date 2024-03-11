class Solution {
    public int maxSubArray(int[] nums) {
        int res=Integer.MIN_VALUE ;
        int j = 0;
        int sum = 0;
        while(j<nums.length){
            if(sum<0) sum =0;
            sum+=nums[j++];
            res = Math.max(sum,res);
        }
        return res;
    }
}