class Solution {
    public String convertToBase7(int num) {
        if(num==0) return "0";
        StringBuilder res=  new StringBuilder();
        boolean flag = num<0;
        num = Math.abs(num);
        while(num>0){
            int rem = num%7;
            res = res.append(rem);
            num = num/7;
        }
        res.reverse();
        if(flag) res.insert(0,"-");
        return res.toString();
    }
}