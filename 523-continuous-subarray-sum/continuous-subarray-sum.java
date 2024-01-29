class Solution {
    public boolean checkSubarraySum(int[] nums, int k) {
        Set<Integer> set = new HashSet<>();
        int sum = 0;
        int prev = 0;
        //(sumJ-sumI)%k==0  ==> sumJ%k==sumI%k 
        // add prev because difference should be greater then 1;
        for(int i=0; i<nums.length; i++){
            sum+=nums[i];
            sum%=k;
            if(set.contains(sum)) return true;
            set.add(prev);
            prev = sum;
        }
        return false;
    }
}