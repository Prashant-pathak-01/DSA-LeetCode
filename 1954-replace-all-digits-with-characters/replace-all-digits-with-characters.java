class Solution {
    public String replaceDigits(String s) {
        if(s.length()==0) return "";
        StringBuilder res = new StringBuilder();
        res.append(s.charAt(0));
        for(int i=1; i<s.length(); i++){
            if(Character.isDigit(s.charAt(i))){
                res.append((char)(s.charAt(i-1)+(s.charAt(i)-'0')));
                continue;
            }
            res.append(s.charAt(i));
        }
        return res.toString();
    }
}