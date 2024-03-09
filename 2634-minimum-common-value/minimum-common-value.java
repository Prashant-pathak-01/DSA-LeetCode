class Solution {
    public int getCommon(int[] nums1, int[] nums2) {
        Set<Integer> set = new HashSet<>();
        int res = Integer.MAX_VALUE;
        for(int i:nums1) set.add(i);
        for(int i:nums2) if(set.contains(i)) res = Math.min(res,i);
        return res == Integer.MAX_VALUE?-1:res;
    }
}