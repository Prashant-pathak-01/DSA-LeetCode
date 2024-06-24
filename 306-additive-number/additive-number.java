class Solution {
    public boolean isValid(String num, long a, long b, long sum,int i ){
        if(i==num.length()) return true;
        if(i>num.length()) return false;
        long currSum = 0;
        boolean res = false;
        long temp = 0;
        for(int x=i; x<num.length(); x++){
            String str = num.substring(i,x+1);
            temp = temp*10+num.charAt(x)-'0';
            if(str.charAt(0)=='0' && temp!=0) continue;
            if(temp==sum){
                res = res|| isValid(num,b,sum,b+sum,x+1);
            }
            if(res) return true;
        }
        return false;
    }
    public boolean isAdditiveNumber(String num) {
        if(num.length()<=2) return false;
        
        long a = 0;
        for(int i=0; i<num.length()-2; i++){
            a = a*10+num.charAt(i)-'0';
            long b = 0;
            for(int j=i+1; j<num.length()-1; j++){
                b = b*10+num.charAt(j)-'0';
                String str1 = num.substring(0,i+1);
                String str2 = num.substring(i+1,j+1);
                if((str1.charAt(0)=='0' && a!=0) ||(str2.charAt(0)=='0' && b!=0) ) continue;
                long sum = a+b;
               if(isValid(num,a,b,sum,j+1)) return true;
            }
        }
        return false;
        
    }
}