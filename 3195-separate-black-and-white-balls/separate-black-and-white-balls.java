class Solution {
    public long minimumSteps(String s) {
        int a = 0;
        int b=  s.length()-1;
        long res = 0;
        while(a<b){
            while(a<b && s.charAt(b)=='1') b--;
            while(a<b && s.charAt(a)=='0') a++;
            res += b-a;
            a++;
            b--;
        }
        return res;
    }
}