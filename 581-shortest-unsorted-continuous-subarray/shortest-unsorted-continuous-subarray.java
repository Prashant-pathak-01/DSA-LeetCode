class Solution {
    public int findUnsortedSubarray(int[] nums) {
        int copy[] = new int[nums.length];
        for(int i=0; i<nums.length; i++) copy[i] = nums[i];
        Arrays.sort(copy);
        int i = 0;
        int j = nums.length-1;
        while(i<nums.length && nums[i]==copy[i]) i++;
        while(j>=0 && nums[j]==copy[j]) j--;
        return Math.max(j-i+1,0);
    }
}