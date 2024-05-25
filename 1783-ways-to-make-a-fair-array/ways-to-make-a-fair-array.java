class Solution {
    public int waysToMakeFair(int[] nums) {
        int res =0;
        int sumO = 0;
        int sumE = 0;
        for(int i=0; i<nums.length; i++){
            if(i%2==0) sumE+=nums[i];
            else sumO+=nums[i];
        }
        int newSumO = 0;
        int newSumE = 0;
        for(int i=0; i<nums.length; i++){
            if(i%2==0){
                sumE-=nums[i];
                if(sumE+newSumE==newSumO+sumO) res++;
                newSumO+=nums[i];
            }else{
                sumO-=nums[i];
                if(sumO+newSumO==newSumE+sumE) res++;
                newSumE+=nums[i];
            }
        }
        return res;

    }
}