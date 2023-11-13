class Solution {
    public int maximumUniqueSubarray(int[] nums) {
        int res = Integer.MIN_VALUE;
        int sum = 0;
        Set<Integer> set = new HashSet<>();
        int i =0 ;
        int j =0 ;
        while(j<nums.length){
            if(!set.contains(nums[j])){
                set.add(nums[j]);
                sum+=nums[j];
                j++;
            }else{
                res= Math.max(res,sum);
                int temp = 0;
                int flag = 0;
                while(i<nums.length){
                    if(nums[i]==nums[j]) break;
                    temp+=nums[i];
                    set.remove(nums[i]);
                    i++;
                }
                sum-=temp;
                i++;
                j++;

            }
        }
        res = Math.max(res,sum);
        return res;
    }
}