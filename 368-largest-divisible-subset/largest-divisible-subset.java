class Solution {
    public List<Integer> largestDivisibleSubset(int[] nums) {
        Arrays.sort(nums);
        int dp[]=new int[nums.length+1];
        List<Integer> ans=new ArrayList<>();
        List<Integer> res=new ArrayList<>();
        Arrays.fill(dp,-1);
        solve(nums,0,1,ans,res,dp);
        return res;
    }
    static void solve(int nums[], int i, int prev,List<Integer> ans,List<Integer> res,int dp[]){
        if(i>=nums.length) {
            if(ans.size()>res.size()){
                res.clear();
                res.addAll(ans);
            }
            return;
        }
        if(ans.size()>dp[i] && (nums[i]%prev==0 || prev%nums[i]==0)){
            dp[i]=ans.size();
            ans.add(nums[i]);
            solve(nums,i+1,nums[i],ans,res,dp);
            ans.remove(ans.size()-1);
        }
        solve(nums,i+1,prev,ans,res,dp);  
    }
}