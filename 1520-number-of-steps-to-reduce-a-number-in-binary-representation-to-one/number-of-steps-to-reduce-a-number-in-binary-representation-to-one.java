class Solution {
    public int numSteps(String s) {
        boolean carry = false;
        int res = 0;
        for(int i=s.length()-1; i>0; i--){
            if(s.charAt(i)=='0'){
                if(carry){
                    res+=2;
                    carry = true;
                }else{
                    res++;
                }
            }else{
                if(carry){
                    res++;
                }else{
                    res+=2;
                }
                carry = true;
            }
        }
        if(s.charAt(0)=='1' && carry) res++;
        return res;
    }
}