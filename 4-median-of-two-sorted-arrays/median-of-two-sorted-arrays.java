class Solution {
    public double findMedianSortedArrays(int[] nums1, int[] nums2) {
        int arr[] = new int[nums1.length+nums2.length];
        int k = 0;
        for(int i=0; i<Math.min(nums1.length, nums2.length); i++){
            arr[k++] = nums1[i];
            arr[k++] = nums2[i];

        }
        if(nums1.length>nums2.length){
            for(int i=Math.min(nums1.length, nums2.length); i<nums1.length; i++){
                arr[k++] = nums1[i];
            }
        } else{
            for(int i=Math.min(nums1.length, nums2.length); i<nums2.length; i++){
                arr[k++] = nums2[i];
            }
        }

        Arrays.sort(arr);
        if(arr.length%2==1) return (double) arr[arr.length/2];
        double temp = (double)arr[arr.length/2]+(double)arr[(arr.length/2)-1];
        return temp/2;
    }
}