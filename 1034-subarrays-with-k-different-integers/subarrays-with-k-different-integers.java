class Solution {
    public int subarrays(int nums[], int k){
        Map<Integer,Integer> map=  new HashMap<>();
        int i =0;
        int j =0 ;
        int res= 0 ;
        while(j<nums.length){
            map.merge(nums[j],1,Integer::sum);
            while(map.size()>k && i<=j){
                map.merge(nums[i],-1,Integer::sum);
                if(map.get(nums[i])==0) map.remove(nums[i]);
                i++;
            }
            res+=(j-i+1);
            j++;
        }
        return res;
    }
    public int subarraysWithKDistinct(int[] nums, int k) {
        return subarrays(nums,k)-subarrays(nums,k-1);
    }
}