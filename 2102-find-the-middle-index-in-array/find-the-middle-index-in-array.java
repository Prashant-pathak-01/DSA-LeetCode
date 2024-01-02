class Solution {
    public int findMiddleIndex(int[] nums) {
        int pref[] = new int[nums.length+1];
        int suff[] = new int[nums.length+1];
        for(int i=0; i<nums.length; i++){
            pref[i+1] = pref[i]+nums[i];
            suff[suff.length-i-2] = suff[suff.length-i-1]+nums[nums.length-1-i];
        }
        for(int i=0; i<nums.length; i++){
            if(pref[i]==suff[i+1]) return i;
        }
        return -1;

    }
}