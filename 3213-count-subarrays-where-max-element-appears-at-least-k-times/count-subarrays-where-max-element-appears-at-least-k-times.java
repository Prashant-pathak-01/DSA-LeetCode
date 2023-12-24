class Solution {
    public long countSubarrays(int[] nums, int k) {
        int max = 0;
        for(int i=0; i<nums.length; i++){
            max = Math.max(max,nums[i]);
        }
        long res = 0;
        int curr = 0;
        int j = 0;
        for(int i=0; i<nums.length; i++){
            if(nums[i]==max) curr++;
            while(curr>=k){
                res+=nums.length-i;
                if(nums[j]==max) curr--;
                j++;
            }
        }
        return res;
    }
}