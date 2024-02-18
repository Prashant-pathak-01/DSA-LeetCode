class Solution {
    public int averageValue(int[] nums) {
        int count = 0;
        int sum = 0;
        for(int i:nums){
            if(i%6==0) {
                count++;
                sum+=i;    
            }
        }
        return count==0?0:sum/count;
    }
}