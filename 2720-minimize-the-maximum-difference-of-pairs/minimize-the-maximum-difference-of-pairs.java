class Solution {
    public int countPairs(int threshold, int arr[]){
        int count =0;
        for(int i=0; i<arr.length; i++){
            if(i<arr.length-1 && arr[i+1]-arr[i]<=threshold) {
                count++;
                i++;
            }
        }
        return count;
    }
    public int minimizeMax(int[] nums, int p) {
        Arrays.sort(nums);
        int min = 0;
        int max = nums[nums.length-1]-nums[0];
        int res= 0;
        while(min<=max){
            int mid = min+(max-min)/2;
            int pairs = countPairs(mid,nums);
            if(pairs>=p){
                res = mid;
                max = mid-1;
            }else min = mid+1;
        }
        return res;
    }
}