class Solution {
    public long minimalKSum(int[] nums, int k) {
        long res = 0;
        Arrays.sort(nums);
        long x = 1;
        int i = 0;
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
        long temp = (((x+k-1)*(x+k))/2)-(((x-1)*(x))/2);
        res+=temp;
        return res;
    }
}