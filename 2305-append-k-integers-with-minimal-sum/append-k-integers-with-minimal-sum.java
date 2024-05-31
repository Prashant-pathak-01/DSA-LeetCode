class Solution {
    public long minimalKSum(int[] nums, int k) {
        long res = 0;
        Arrays.sort(nums);
        int x = 1;
        int i = 0;
        int prev = -1;
        while(i<nums.length && k>0){
            while(i>0 && i<nums.length && nums[i]==nums[i-1]) i++;
            if(i==nums.length) break;
            if(nums[i]==x) {
                i++;
            }
            else{
                res+=x;
                k--;
            }
            x++;
        }
        while(k-->0) res+=x++;
        return res;
    }
}