class Solution {
    public String reverseOnlyLetters(String s) {
        StringBuilder res = new StringBuilder();
        for(int i=0; i<s.length(); i++){
            if(Character.isUpperCase(s.charAt(i)) || Character.isLowerCase(s.charAt(i))) res.append(s.charAt(i));
        }
        res.reverse();
        for(int i=0; i<s.length(); i++){
            if(!Character.isUpperCase(s.charAt(i)) && ! Character.isLowerCase(s.charAt(i))) res.insert(i,s.charAt(i));

        }
        return res.toString();
    }
}