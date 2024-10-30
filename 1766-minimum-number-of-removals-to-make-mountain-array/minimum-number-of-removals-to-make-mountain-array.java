class Solution {
    public int minimumMountainRemovals(int[] nums) {
        int l[] = new int[nums.length];
        int r[] = new int[nums.length];
        for(int i=0; i<nums.length; i++){
            for(int j=0; j<i; j++){
                if(nums[i]>nums[j]) l[i] = Math.max(l[i],l[j]+1);
            }
        }
        for(int i=nums.length-1; i>=0; i--){
            for(int j=nums.length-1; j>i; j--){
                if(nums[i]>nums[j]) r[i] = Math.max(r[i],r[j]+1);
            }
        }
        int res = 0;
        for(int i=1; i<nums.length-1; i++) {
            if(l[i]>0 && r[i]>0) res = Math.max(res,l[i]+r[i]);
        }
        return nums.length-res-1;
    }
}