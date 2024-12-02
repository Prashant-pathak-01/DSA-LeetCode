class Solution {
    public int maximumBeauty(int[] nums, int k) {
        Arrays.sort(nums);
        int res =0 ;
        int j =0;
        for(int i=0; i<nums.length; i++){
            while(nums[i]-nums[j]>2*k) j++;
            res = Math.max(i-j+1,res);
        }
        return res;
    }
}