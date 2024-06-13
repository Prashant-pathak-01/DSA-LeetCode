class Solution {
    public int singleNumber(int[] nums) {
        int res =0 ;
        for(int i=0; i<32; i++){
            int sum = 0;
            for(int j:nums){
                sum+=(((j>>i)&1)==1)?1:0;
            }
            if(sum%3==1) res |=(1<<i);
        }
        return res;
    }
}