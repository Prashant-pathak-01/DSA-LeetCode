class Solution {
    int count = 0;
    public void calc(int arr[], int i, int sum , int tar){
        if(i==arr.length){
            if(sum==tar) count++;
            return;
        }
        calc(arr,i+1,sum+arr[i],tar);
        calc(arr,i+1,sum-arr[i],tar);
    }
    public int findTargetSumWays(int[] nums, int target) {
        calc(nums,0,0,target);
        return count;
    }
}