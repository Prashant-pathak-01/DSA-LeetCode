class Solution {
    public int numberOfSubarrays(int[] nums, int k) {
        for(int i=0; i<nums.length; i++) nums[i]%=2;
        int res= 0;
        int count =0;
        int j = 0;
        for(int i=0; i<nums.length; i++){
            if(nums[i]==1) {
                k--;
                count = 0;
            }
            while(k==0){
                count++;
                if(nums[j++]==1) k++;
            }
            res+=count;
        }
        return res;
    }
}