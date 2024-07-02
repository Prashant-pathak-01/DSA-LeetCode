class Solution {
    public int[] intersect(int[] nums1, int[] nums2) {
        HashMap<Integer, Integer> hello = new HashMap<Integer,Integer>();
        ArrayList<Integer> temp = new ArrayList<>();
        for(int i =0; i<nums1.length; i++) {
            if(hello.containsKey(nums1[i])) {
                hello.put(nums1[i],hello.get(nums1[i])+1);
            } else{
                hello.put(nums1[i],1);
            }
        }

        for(int i=0; i<nums2.length; i++) {
            if(hello.containsKey(nums2[i]) && hello.get(nums2[i])>0 ) {
                temp.add(nums2[i]);
                hello.put(nums2[i], hello.get(nums2[i])-1);
            }
        }
        int arr[] = new int[temp.size()];


        for(int i=0; i<temp.size(); i++) {
            arr[i] = temp.get(i);
        }

        return arr;
    }
}