class Solution {
    public int minimumArrayLength(int[] nums) {
        int min = nums[0];
        int count = 0;
        for(int i:nums) min = Math.min(min,i);
        for(int i:nums) if(i%min!=0) return 1;
        for(int i:nums) if(min==i) count++;
        return (count+1)/2;
    }
}