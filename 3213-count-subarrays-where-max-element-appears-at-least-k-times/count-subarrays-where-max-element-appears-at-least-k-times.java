class Solution {
    public long countSubarrays(int[] nums, int k) {
        int max= Integer.MIN_VALUE;
        for(int i:nums) max = Math.max(i, max);
        int count = 0;
        long res= 0 ;
        int i=0,j =0;
        while(j<nums.length){
            if(nums[j]==max) count++;
            if(count>=k){
                while(count>=k){
                    res+=nums.length-j;
                    if(nums[i]==max) count--;
                    i++;
                }
            }
            j++;
        }
        return res;
    }
}