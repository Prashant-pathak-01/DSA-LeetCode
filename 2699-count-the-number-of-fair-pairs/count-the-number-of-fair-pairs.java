class Solution {
    public int left(int nums[], int tar){
        int i =0;
        int j = nums.length-1;
        int res = -1;
        while(i<=j){
            int mid = (i+j)/2;
            if(nums[mid]>=tar){
                res = mid;
                j = mid-1;
            }else i = mid+1;
        }
        return res;
    }
    public int right(int nums[], int tar){
        int i =0;
        int j = nums.length-1;
        int res = -1;
        while(i<=j){
            int mid = (i+j)/2;
            if(nums[mid]<=tar){
                res = mid;
                i = mid+1;
            }else j = mid-1;
        }
        return res;
    }
    public int solve(int nums[], int l, int r, int i){
        int left = left(nums,l-nums[i]);
        if(left==-1) return 0;
        int right = right(nums,r-nums[i]);
        if(right==-1) return 0;
        //if(left>right) return 0;
        //System.out.println(left+" "+right+" "+i);
        int diff = (right-left+1);
        if(left<=i && right>=i) diff--;
        return diff;

    }
    public long countFairPairs(int[] nums, int lower, int upper) {
        Arrays.sort(nums);
        long res= 0;
        for(int i=0; i<nums.length; i++){
            int temp =solve(nums,lower,upper,i);
           // System.out.println(temp);
            res+=temp;
        }
        return res/2;
    }
}