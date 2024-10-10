class Solution {
    public int calc(int a, int b, int c){
        int res = 0;
        String str = Integer.toBinaryString(a)+Integer.toBinaryString(b)+Integer.toBinaryString(c);
        for(int i=0; i<str.length(); i++){
            res=res<<1;
            if(str.charAt(i)=='1') res++;
        }
        return res;
    }
    public int maxGoodNumber(int[] nums) {
        int res= 0;
        res = Math.max(res,calc(nums[0],nums[1],nums[2]));
        res = Math.max(res,calc(nums[0],nums[2],nums[1]));
        res = Math.max(res,calc(nums[1],nums[0],nums[2]));
        res = Math.max(res,calc(nums[1],nums[2],nums[0]));
        res = Math.max(res,calc(nums[2],nums[1],nums[0]));
        res = Math.max(res,calc(nums[2],nums[0],nums[1]));
        return res;
    }
}