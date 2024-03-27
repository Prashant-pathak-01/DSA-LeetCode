class Solution {
    public double findMaxAverage(int[] nums, int k) {
        double res = Integer.MIN_VALUE;
        int i =0 ;
        int j =0;
        double sum = 0;
        while(j<k-1) sum+=nums[j++];
        while(j<nums.length){
            sum+=nums[j];
            res = Math.max(res,sum/(double)k);
            j++;
            sum-=nums[i];
            i++;
        }
        return res;

    }
}