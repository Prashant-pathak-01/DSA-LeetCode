class Solution {
    public int countDistinctIntegers(int[] nums) {
        Set<String> set = new HashSet<>();
        for(int i=0; i<nums.length; i++){
            set.add(String.valueOf(nums[i]));
            long temp = 0;
            while(nums[i]>0){
                temp = temp*10+nums[i]%10;
                nums[i]/=10;
            }
            set.add(String.valueOf(temp));
        }
        return set.size();
    }
}