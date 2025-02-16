class Solution {
public:
    int minimumIndex(vector<int>& nums) {
        unordered_map<int,int> map;
        for(int i=0; i<nums.size(); i++){
            map[nums[i]]++;
        }
        int max;
        int right;
        for(const auto &[key,val]:map){
            if(val>=nums.size()/2){
                max = key;
                right = val;
            }
        }
        int res =-1;
        int left =0;
        for(int i=0; i<nums.size(); i++){
            if(max==nums[i]) {
                right--;
                left++;
            }
            if(left>i-left+1 && right>nums.size()-i-1-right) return i;
        }
        return res;
    }
};