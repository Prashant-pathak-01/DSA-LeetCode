class Solution {
    public boolean isValid(String s) {
        if(s.length()%3!=0) return false;
        Stack<Character> stack = new Stack<>();
        for(int i=0; i<s.length(); i++){
            if(s.charAt(i)=='c'){
                if(stack.size()>=2){
                    char b = stack.pop();
                    char a = stack.pop();
                    if(b=='b' && a=='a') continue;
                    else {
                        stack.push(a);
                        stack.push(b);
                        stack.push(s.charAt(i));
                    }
                }else return false;
            }else stack.push(s.charAt(i));
        }
        return stack.isEmpty();
    }
}