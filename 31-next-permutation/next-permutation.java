class Solution {
    public void nextPermutation(int[] nums) {
        int indx =-1;
        for(int i=nums.length-2;  i>=0; i--){
            if(nums[i]<nums[i+1]){
                indx=  i;
                break;
            }
        }
        if(indx==-1) {
            int i = 0;
            int j = nums.length-1;
            while(i<j){
                int temp = nums[i];
                nums[i] = nums[j];
                nums[j] = temp;
                i++;
                j--;
            }
            return;
        }
        int greater = Integer.MAX_VALUE;
        int indx2 = 0;
        for(int i=indx+1; i<nums.length; i++){
            if(nums[i]<greater && nums[i]>nums[indx]){
                greater = nums[i];
                indx2= i;
            }
        }
        int temp = nums[indx2];
        nums[indx2] = nums[indx];
        nums[indx] = temp;

        Arrays.sort(nums,indx+1,nums.length);
        return;
    }
}