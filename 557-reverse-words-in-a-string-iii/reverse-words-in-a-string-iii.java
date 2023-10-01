class Solution {
    public String reverseWords(String s) {
        StringBuilder temp = new StringBuilder();
        StringBuilder res = new StringBuilder();
        
        for(int i=0; i<s.length(); i++){
            if(s.charAt(i)==' '){
                temp.reverse();
                res.append(temp);
                res.append(" ");
                temp.setLength(0);
            } else{
                temp.append(s.charAt(i));
            }
        }
        temp.reverse();
        res.append(temp);
        return res.toString();
    }
}