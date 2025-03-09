class Solution {
    public int minSwaps(int[] nums) {
        int count =0;
        for(int i:nums) if(i==1) count++;
        int temp =0;
        for(int i=0; i<count; i++){
            if(nums[i]==0) temp++; 
        }
        int res =temp;
        int j = 0;
        for(int i=count; i<nums.length; i++){
            if(nums[j++]==0) temp--;
            if(nums[i]==0) temp++;
            res = Math.min(res,temp);
        }
        for(int i=0; i<count-1; i++){
            if(nums[i]==0) temp++;
            if(nums[j++]==0) temp--;
            res = Math.min(res,temp);
        }
        return res;
    }
}