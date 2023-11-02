class Solution {
    public long minSum(int[] nums1, int[] nums2) {
        long sum1 = 0;
        long sum2 = 0;
        long a1 = 0;
        long a2 = 0;

        for(int i:nums1){
            a1+=(i==0)?1:0;
            sum1+=Math.max(i,1);
        }
        for(int i:nums2){
            a2+=(i==0)?1:0;
            sum2+=Math.max(i,1);
        }
        if(a1==0 && sum1<sum2) return -1;
        if(a2==0 && sum2<sum1) return -1;

        return Math.max(sum1,sum2);
    }
}