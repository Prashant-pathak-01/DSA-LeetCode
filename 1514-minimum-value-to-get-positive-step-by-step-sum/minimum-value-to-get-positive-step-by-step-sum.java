class Solution {
    public int minStartValue(int[] nums) {
        int sum =0;
        int res= 1;
        for(int i:nums){
            sum+=i;
            if(sum<0) res = Math.max(res,Math.abs(sum)+1);
        }
        return res;
    }
}