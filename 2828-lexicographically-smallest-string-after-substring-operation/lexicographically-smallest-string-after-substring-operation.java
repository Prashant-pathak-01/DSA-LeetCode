class Solution {
    public String smallestString(String s) {
        int i=0;
        while(i<s.length() && s.charAt(i)=='a') i++;
        if(i==s.length()) return s.substring(0,s.length()-1)+'z';
        int start = i;
        while(i<s.length() && s.charAt(i)!='a') i++;
        int end =  i;
        StringBuilder res = new StringBuilder();
        for(i=0; i<s.length(); i++){
            if(i>=start && i<end){
                res.append((char)(s.charAt(i)-1));
            }else{
                res.append(s.charAt(i));
            }
        }
        return res.toString();
    }
}