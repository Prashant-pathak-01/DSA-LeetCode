class Solution {
    public long sumDigitDifferences(int[] nums) {
        String[] str = new String[nums.length];
        for (int i = 0; i < nums.length; i++) {
            str[i] = String.valueOf(nums[i]);
        }
        int numDigits = str[0].length();
        long res = 0;
        for (int i = 0; i < numDigits; i++) {
            int[] digitCount = new int[10];
            
            for (String numStr : str) digitCount[numStr.charAt(i) - '0']++;

            long totalPairs = (long) nums.length* (nums.length - 1) / 2;
            long pairs = 0;
            for (int count : digitCount) {
                pairs += (long) count * (count - 1) / 2;
            }
            res += totalPairs - pairs;
        }
        return res;
    }
}