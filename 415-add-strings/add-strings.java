class Solution {
    public String addStrings(String num1, String num2) {
        int carry = 0;
        int i = num1.length()-1; 
        int j = num2.length()-1; 
        StringBuilder res = new StringBuilder();
        while(i>=0 && j>=0){
            int sum = (num1.charAt(i)-'0')+(num2.charAt(j)-'0')+carry;
            carry = sum/10;
            if(sum>9) sum%=10;
            res.append(sum);
            i--;
            j--;
        }
        while(i>=0){
            int sum = (num1.charAt(i)-'0')+carry;
            carry = sum/10;
            if(sum>9) sum%=10;
            res.append(sum);
            i--;
        }
        while(j>=0){
            int sum = (num2.charAt(j)-'0')+carry;
            carry = sum/10;
            if(sum>9) sum%=10;
            res.append(sum);
            j--;
        }
        if(carry!=0) res.append(carry);
        res.reverse();
        return res.toString();
    }
}