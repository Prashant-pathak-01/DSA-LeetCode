class Solution {
    public int longestPalindrome(String s) {
        int arr[] = new int[128];
        for(char c: s.toCharArray()){
            arr[c]++;
        }
        int res = 0;
        boolean xtra = false;
        for(int i=0; i<arr.length; i++){
            res+=((arr[i]/2)*2);
            if(arr[i]%2!=0) xtra = true;
        }
        res+=xtra?1:0;
        return res;
    }
}