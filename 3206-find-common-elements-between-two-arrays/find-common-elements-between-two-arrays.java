class Solution {
    public int[] findIntersectionValues(int[] nums1, int[] nums2) {
        Set<Integer> set = new HashSet<>();
        int res[] = new int[2];
        for(int i=0; i<nums1.length; i++){
            set.add(nums1[i]);
        }
        int count = 0;
        for(int i=0; i<nums2.length; i++){
            if(set.contains(nums2[i])) count++;
        }
        res[1] = count;
        count= 0;
        set.clear();
        for(int i=0; i<nums2.length; i++){
            set.add(nums2[i]);
        }
        for(int i=0; i<nums1.length; i++){
            if(set.contains(nums1[i])) count++;
        }
        res[0] = count;
        return res;
        }
}