class Solution {
    public int findTheLongestBalancedSubstring(String s) {
        int res =0;
        int zero = 0;
        int one =0;
        for(int i=0; i<s.length(); i++){
            if(s.charAt(i)=='0') {
                zero++;
            }else{
                while(i<s.length() && s.charAt(i)=='1') {
                    one++;
                    i++;
                }
                res = Math.max(res,Math.min(one,zero)*2);
                i--;
                one =0 ;
                zero = 0;
            }
        }
        return res;
    }
}