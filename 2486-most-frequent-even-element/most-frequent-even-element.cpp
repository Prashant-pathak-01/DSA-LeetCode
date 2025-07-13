class Solution {
public:
    int mostFrequentEven(vector<int>& nums) {
        vector<int> result;
        for (int i = 0; i < nums.size(); i++) {
            if (nums[i] % 2 == 0) {
                result.push_back(nums[i]);
            }
        }
        map<int, int> freq;
        for (int i = 0; i < result.size(); i++) {
            freq[result[i]]++;
        }
        int maxFreq = 0;
        int ans = -1;
        for (auto it : freq) {
            if (it.second > maxFreq) {
                maxFreq = it.second;
                ans = it.first;
            } else if (it.first < ans && it.second == maxFreq) {
                ans = it.first;
            }
        }
        return ans;
    }
};