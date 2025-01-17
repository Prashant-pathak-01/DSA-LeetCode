class Solution {
    public void addBits( int num,int arr[]){
        int index =0;
        while(num>0){
            if((num&1)==1) arr[index]++;
            index++;
            num =num>>1;

        }
    }
    public void removeBits( int num,int arr[]){
        int index =0;
        while(num>0){
            if((num&1)==1) arr[index]--;
            index++;
            num =num>>1;
            
        }
    }
    public boolean greater(int arr[], int num){
        int temp = 0;
        for(int i=0; i<arr.length; i++){
            if(arr[i]>0) temp = temp|(1<<i);
        }
        return temp>=num;
    }
    public int minimumSubarrayLength(int[] nums, int k) {
        for(int i:nums) if(i>=k) return 1;
        int res =Integer.MAX_VALUE;
        int j =0;
        int or =0;
        int bits[] = new int[32];
        for(int i=0; i<=nums.length; i++){
            while(greater(bits,k)){
                res = Math.min(res,i-j);
                removeBits(nums[j],bits);
                j++;
            }
            if(i<nums.length){
                addBits(nums[i],bits);
                or = or | nums[i];
            }
        }

        return res==Integer.MAX_VALUE?-1:res;
    }
}