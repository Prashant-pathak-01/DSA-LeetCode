class Solution {
    int MOD = (int)1e9+7;
    public int maxSum(int[] nums1, int[] nums2) {
        int i = 0;
        int j = 0;
        long res = 0;
        while (i <= nums1.length && j <= nums2.length) {
            long sum1 = 0;
            long sum2 = 0;
            while (i < nums1.length && j < nums2.length && nums1[i] != nums2[j]) {
                if (nums1[i] < nums2[j])
                    sum1 = (sum1+nums1[i++])%MOD;
                else
                    sum2 = (sum2+nums2[j++])%MOD;
            }
            while (i == nums1.length && j < nums2.length) {
                sum2 = (sum2+nums2[j++]);
            }
            while (j == nums2.length && i < nums1.length) {
                sum1 = (sum1+nums1[i++]);
            }
            res = (res+Math.max(sum1, sum2));
            if(i<nums1.length && j<nums2.length) res = (res+nums1[i]);
            i++;
            j++;
            
        }
        
        return (int)(res %(1e9+7));
    }
}