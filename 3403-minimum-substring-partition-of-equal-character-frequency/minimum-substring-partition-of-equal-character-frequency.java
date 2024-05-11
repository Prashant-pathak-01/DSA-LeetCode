class Solution {
    public boolean isValid(int arr[]) {
        int prev = -1;
        for (int i = 0; i < arr.length; i++) {
            if (prev != -1 && arr[i] != 0 && arr[i] != prev) {
                return false;
            }
            if (prev == -1 && arr[i] != 0) {
                prev = arr[i];
            }
        }
        return true;
    }
    
    public int generate(String str, int[] memo) {
        if (str.length() == 0) return 0;
        if (memo[str.length()] != -1) return memo[str.length()];
        
        int res = Integer.MAX_VALUE;
        int arr[] = new int[26];
        
        for (int i = 0; i < str.length(); i++) {
            arr[str.charAt(i) - 'a']++;
            if (isValid(arr)) {
                res = Math.min(res, 1 + generate(str.substring(i + 1), memo));
            }
        }
        memo[str.length()] = res;
        return res;
    }

    public int minimumSubstringsInPartition(String s) {
        int[] memo = new int[s.length() + 1];
        Arrays.fill(memo, -1);
        return generate(s, memo);
    }
}
