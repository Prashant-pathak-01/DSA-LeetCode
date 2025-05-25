class Solution {
    public String resultingString(String s) {
        Stack<Integer> stack = new Stack<>();
        for(int i=0; i<s.length(); i++){
            int curr = s.charAt(i)-'a';
            if(!stack.isEmpty() && (stack.peek()==curr+1 || stack.peek()==curr-1 || (curr==0 && stack.peek()==25) || (curr==25 && stack.peek()==0))) stack.pop();
            else stack.push(curr);
        }
        StringBuilder res = new StringBuilder();
        while(!stack.isEmpty()){
            res.append((char)('a'+stack.pop()));
        } 
        res.reverse();
        return res.toString();
    }
}