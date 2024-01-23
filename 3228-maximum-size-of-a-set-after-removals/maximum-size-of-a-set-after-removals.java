class Solution {
    public int maximumSetSize(int[] nums1, int[] nums2) {
        Set<Integer> set = new HashSet<>();
        Set<Integer> set1 = new HashSet<>();
        Set<Integer> set2 = new HashSet<>();

        for(int i=0; i<nums1.length; i++){
            set.add(nums1[i]);
            set1.add(nums1[i]);
        }
        for(int i=0; i<nums2.length; i++){
            set.add(nums2[i]);
            set2.add(nums2[i]);
        }
        return Math.min(set.size(),Math.min(set1.size(),nums1.length/2)+Math.min(set2.size(),nums2.length/2));
    }
}