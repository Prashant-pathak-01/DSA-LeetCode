class Solution {
    public int maxAbsoluteSum(int[] nums) {
        int sum1= 0;
        int sum2 =0;
        int res= 0;
        for(int i=0; i<nums.length; i++){
            sum1+=nums[i];
            res = Math.max(res,Math.abs(sum1));
            if(sum1<0) sum1 =0;
        }
        for(int i=0; i<nums.length; i++){
            sum2+=nums[i];
            res = Math.max(res,Math.abs(sum2));
            if(sum2>0) sum2 =0;
        }
        return res;
    }
}