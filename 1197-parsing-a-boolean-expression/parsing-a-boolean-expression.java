class Solution {
    public boolean parseBoolExpr(String s) {
        Stack<Character> stack1 = new Stack<>();
        Stack<Character> stack2 = new Stack<>();
        for(int i=0; i<s.length(); i++){
            if(s.charAt(i)==',') continue;
            else if(s.charAt(i)=='|' || s.charAt(i)=='&' || s.charAt(i)=='!') stack2.push(s.charAt(i));
            else{
                if(s.charAt(i)==')'){
                    char ch = stack2.pop();
                    boolean res = stack1.peek()=='t'?true:false;
                    while(!stack1.isEmpty() && stack1.peek()!='('){
                        if(ch=='&'){
                            if(stack1.peek()=='f') res = false;
                        }else if(ch=='|'){
                            if(stack1.peek()=='t') res = true;
                        }else{
                            res = !res;
                        }
                        stack1.pop();
                    }
                    stack1.pop();
                    stack1.push(res?'t':'f');
                }else{
                    stack1.push(s.charAt(i));
                }
            }
        }
        
        return stack1.peek()=='t'?true:false;
    }
}