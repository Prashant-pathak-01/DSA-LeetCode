class Solution {
    public int xorAllNums(int[] nums1, int[] nums2) {
        Set<Integer> set = new HashSet<>();
        for(int i=0; i<nums1.length; i++) {
            if(nums2.length%2==1) {
                if(set.contains(nums1[i])) set.remove(nums1[i]);
                else set.add(nums1[i]);
            }
        }
        for(int i=0; i<nums2.length; i++) {
            if(nums1.length%2==1) {
                if(set.contains(nums2[i])) set.remove(nums2[i]);
                else set.add(nums2[i]);
            }
        }
        int res= 0;
        for(int i:set) res = res^i;
        return res;
    }
}