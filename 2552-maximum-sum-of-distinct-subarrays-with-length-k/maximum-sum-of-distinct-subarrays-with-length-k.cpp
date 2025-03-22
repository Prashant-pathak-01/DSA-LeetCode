class Solution {
public:
    long long maximumSubarraySum(vector<int>& nums, int k) {
        long long res =0;
        long long sum =0;
        map<int,int> map;
        for(int i=0; i<k-1; i++) {
            map[nums[i]]++;
            sum+=nums[i];
        }
        int count = map.size();
        int j =0;
        for(int i=k-1; i<nums.size(); i++){
            if(map[nums[i]]==0) count++;
            sum+=nums[i];
            // cout<<sum<<" "<<count<<"\n";
            map[nums[i]]++;
            if(count==k) res=max(res,sum);
            sum-=nums[j];
            map[nums[j]]--;
            if(map[nums[j]]==0) count--;
            j++;
        }
        return res;

    }
};