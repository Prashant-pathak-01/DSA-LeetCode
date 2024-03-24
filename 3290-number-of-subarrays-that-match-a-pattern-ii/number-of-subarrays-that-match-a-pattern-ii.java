class Solution {
    public int[] kmapCalc(String str){
        int[] lps = new int[str.length()];
        for (int i = 1; i < str.length(); i++) {
            int prevIdx = lps[i - 1];
            while (prevIdx > 0 && str.charAt(i) != str.charAt(prevIdx)) {
                prevIdx = lps[prevIdx - 1];
            }
            lps[i] = prevIdx + (str.charAt(i) == str.charAt(prevIdx) ? 1 : 0);
        }
        return lps;
    }
    public int countMatchingSubarrays(int[] nums, int[] pattern) {
        StringBuilder str1 = new StringBuilder();
        StringBuilder str2 = new StringBuilder();
        for(int i=0; i<pattern.length; i++) {
            if(pattern[i]==1) str1.append('2');
            else if(pattern[i]==0) str1.append('1');
            else str1.append('0');
        }
        for(int i=0; i<nums.length-1; i++){
            if(nums[i+1]>nums[i]) str2.append('2');
            else if(nums[i+1]==nums[i]) str2.append('1');
            else str2.append('0');
        }
        int kmap[] = kmapCalc(str1.toString()+"#"+str2.toString());
        int res= 0;
        for(int i:kmap){
            if(i==pattern.length) res++;
        }
        return res;
    }
}