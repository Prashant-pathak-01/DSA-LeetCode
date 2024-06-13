class Solution {
    public String convertToBase7(int num) {
        if(num==0) return "0";
        String res=  "";
        boolean flag = num<0;
        num = Math.abs(num);
        while(num>0){
            int rem = num%7;
            res = rem+res;
            num = num/7;
        }
        res = flag?"-"+res:""+res;
        return res;
    }
}