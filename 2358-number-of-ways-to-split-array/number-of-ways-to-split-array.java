class Solution {
    public int waysToSplitArray(int[] nums) {
        long psum =0;
        for(int i=nums.length-1; i>=0; i--){
            psum+=nums[i];
        }
        int res= 0;
        long sum =0;
        for(int i=0; i<nums.length-1; i++){
            sum+=nums[i];
            psum-=nums[i];
            if(sum>=psum) {
                res++;
                //System.out.println(sum+" "+psum);
            }
        }
        return res;
    }
}