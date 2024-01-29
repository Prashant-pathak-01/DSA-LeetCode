class Solution {
    public int[] intersection(int[] nums1, int[] nums2) {
        Set<Integer> set  =new HashSet<>();
        List<Integer> list  =new ArrayList<>();
        List<Integer> res  =new ArrayList<>();
        for(int i:nums1) set.add(i);
        for(int i:nums2) if(!list.contains(i)) list.add(i);
        for(int i=0; i<list.size(); i++){
            if(set.contains(list.get(i))) res.add(list.get(i));
        }
        int arr[] = new int[res.size()];
        for(int i=0; i<arr.length; i++){
            arr[i]  = res.get(i);
        }
        return arr;
    }
}