class Solution {
    public int calculate(String s) {
        Stack<String> stack = new Stack<>();
        long num = 0;
        boolean flag = true;
        for(int i=0; i<s.length(); i++){
            if(s.charAt(i)==' ') continue;
            else if(s.charAt(i)=='+') {
                stack.add(String.valueOf(num));
                num = 0;
            }
            else if(s.charAt(i)=='-') {
                stack.add(String.valueOf(num));
                num = 0;
                flag = !flag;
            }else if(s.charAt(i)=='(') {
                if(!flag){
                    flag = true;
                    stack.add("-");
                }
                stack.add("(");
            }
            else if(s.charAt(i)==')'){
                while(!stack.peek().equals("(")){
                    long b = Long.parseLong(stack.pop());
                    num+=b;
                }
                stack.pop();
                if(!stack.isEmpty() && stack.peek().equals("-")) {
                    stack.pop();
                    stack.push(String.valueOf(num*-1));
                }
                else stack.push(String.valueOf(num));
                num = 0;
            }else {
                num*=10;
                if(num>=0) num+=(s.charAt(i)-'0');
                else num-=(s.charAt(i)-'0');
                if(!flag){
                    flag = true;
                    num*=-1;
                }
            }
        }
        stack.add(String.valueOf(num));
        long res =0;
        while(!stack.isEmpty()) res+=Long.parseLong(stack.pop());
        return (int)res;
    }
}