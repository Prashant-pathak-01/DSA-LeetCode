class Solution {
    public String removeOuterParentheses(String s) {
        int open = 1;
        StringBuilder res = new StringBuilder();
        for(int i=1; i<s.length(); i++){
            if(s.charAt(i)=='('){
                open++;
                if(open>1) res.append('(');
            }else{
                if(open>1) res.append(')');
                open--;
            }
        }
        return res.toString();
    }
}