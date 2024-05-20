class Solution {
    public int subsetXORSum(int[] nums) {
        int res = 0;
        for (int i = 0; i < (1 << nums.length); i++) {
            int xor = 0;
            for (int j = 0; j < nums.length; j++) {
                if ((i & (1 << j)) != 0) {
                    xor ^= nums[j];
                }
            }
            res += xor;
        }
        return res;
    }
}