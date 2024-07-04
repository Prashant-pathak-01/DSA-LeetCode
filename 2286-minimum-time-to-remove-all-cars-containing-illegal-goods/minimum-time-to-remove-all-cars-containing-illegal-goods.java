class Solution {
    public int minimumTime(String s) {
        int res = s.length();
        int left = 0;
        for(int i=0; i<s.length(); i++){
            int temp = 0;
            if(s.charAt(i)=='1') temp = 2;
            left = Math.min(i+1,left+temp);
            res = Math.min(res,left+s.length()-1-i);
        }
        return res;
    }
}