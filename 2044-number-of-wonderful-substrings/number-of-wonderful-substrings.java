class Solution {
    public long wonderfulSubstrings(String word) {
        // could not understand ;}
        long[] count = new long[1024];
        count[0] = 1; 
        int mask = 0;
        long res = 0;
        for (int i=0; i<word.length(); i++) {
            int idx = word.charAt(i) - 'a';
            mask ^= 1 << idx; 
            res += count[mask]; 
            for (int j = 1;j <= 512; j*=2) {
                res += count[mask ^ j];
            }
            count[mask]++; 
        }
        return res;
    }
}