class Solution {
    public long minOperations(int[] nums1, int[] nums2, int k) {
        if(k==0) {
            for(int i=0; i<nums1.length; i++){
                if(nums1[i]!=nums2[i]) return -1;
            }    
            return 0;
        };
        int count= 0;
        long res =0;
        for(int i=0; i<nums1.length; i++){
            int diff = nums2[i]-nums1[i];
            if(diff%k!=0) return -1;
            if(diff>0) {
                count+=diff/k;
                res+=diff/k;
            } else if(diff<0) count-=(diff*-1)/k;
        }
        return count==0?res:-1;
    }
}