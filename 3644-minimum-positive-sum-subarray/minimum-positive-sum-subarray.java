class Solution {
    public int minimumSumSubarray(List<Integer> nums, int l, int r) {
        int res= Integer.MAX_VALUE;
        for(int i=0; i<nums.size(); i++){
            int sum =0;
            for(int j=i; j<nums.size(); j++){
                sum+=nums.get(j);
                if(j-i+1>=l && j-i+1<=r){
                    if(sum>0) res = Math.min(sum,res);
                }
            }
        }
        return res==Integer.MAX_VALUE?-1:res;
    }
}