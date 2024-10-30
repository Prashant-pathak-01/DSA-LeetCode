class Solution {
    public int findIndex(int nums[], long next){
        int i=0;
        int j = nums.length-1;
        while(i<=j){
            int mid = (i+j)/2;
            if((long)nums[mid]==next) return mid;
            else if((long)nums[mid]>next) j = mid-1;
            else i = mid+1;
        }
        return -1;
    }
    public int longestSquareStreak(int[] nums) {
        Arrays.sort(nums);
        int res= 0;
        for(int i=0; i<nums.length; i++){
            if(nums[i]>0){
                int count =1;
                long next = (long)nums[i]*nums[i];
                int index = findIndex(nums,next);
                while(index!=-1){
                    nums[index]*=-1;
                    count++;
                    next*=next;
                    index = findIndex(nums,next);
                }
                //if(count>1) System.out.println(nums[i]);
                res = Math.max(res,count);
            }
        }
        return res>1?res:-1;
    }
}