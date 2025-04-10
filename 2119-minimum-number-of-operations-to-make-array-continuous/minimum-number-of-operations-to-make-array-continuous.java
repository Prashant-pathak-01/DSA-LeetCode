class Solution {
    public int solve(int arr[], int i, int n){
        int left  = i;
        int right = arr.length-1;
        int target = arr[i]+n-1;
        int res =0;
        while(left<=right){
            int mid = (left+right)/2;
            if(arr[mid]<=target) {
                res = mid;
                left = mid+1;
            }else right = mid-1;
        }
        return res-i+1;
    }
    public int minOperations(int[] nums) {
        Set<Integer> set = new HashSet<>();
        for(int i:nums) set.add(i);
        int arr[] = new int[set.size()];
        int x =0;
        for(int i:set) arr[x++] = i;
        Arrays.sort(arr);
        int res = 0;
        for(int i=0; i<arr.length; i++){
            res = Math.max(res,solve(arr,i,nums.length));
        }
        return nums.length-res;
    }
}