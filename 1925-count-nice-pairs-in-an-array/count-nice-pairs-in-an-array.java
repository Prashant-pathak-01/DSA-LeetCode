class Solution {
    public int reverse(int num){
        int res = 0;
        while(num>0){
            res=res*10+num%10;
            num/=10;
        }
        return res;
    }
    public int countNicePairs(int[] nums) {
        for(int i=0; i<nums.length; i++){
            nums[i] = nums[i]-reverse(nums[i]);
        }
        Arrays.sort(nums);
        int mod =1000000007;
        long res = 0;
        for(int i=0; i<nums.length-1; i++){
            long count = 1;
            while(i<nums.length-1 && nums[i]==nums[i+1]){
                count++;
                i++;
            }
            res=(res%mod+(count*(count-1))/2)%mod;
        }
        return (int)res%mod;

    }
}