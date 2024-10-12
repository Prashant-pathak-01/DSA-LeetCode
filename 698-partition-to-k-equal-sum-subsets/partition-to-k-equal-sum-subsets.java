class Solution {
    public boolean solve(int nums[], boolean visited[], int i, int k, int sum, int tar){
        if(k==0) return true;
        if(sum==tar) return solve(nums,visited,0,k-1,0,tar);
        for(int x=i; x<nums.length; x++){
            if(visited[x] || sum+nums[x]>tar) continue;
            visited[x] = true;
            if(solve(nums,visited,x+1,k,sum+nums[x],tar)) return true;
            visited[x] = false;
        }
        return false;
    }
    public boolean canPartitionKSubsets(int[] nums, int k) {
        int sum =0;
        for(int i:nums) sum+=i;
        if(sum%k!=0) return false;
        Arrays.sort(nums);
        boolean visited[] = new boolean[nums.length];
        return solve(nums,visited,0,k,0,sum/k);
    }

}