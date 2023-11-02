class Solution {
    public String operation(String a, String b, String c){
        int aa = Integer.parseInt(a);
        int bb = Integer.parseInt(b);

        if(c.equals("+")){
            return String.valueOf(aa+bb);
        } else if(c.equals("-")){
            return String.valueOf(aa-bb);
        } else if(c.equals("*")){
            return String.valueOf(aa*bb);
        } else{
            return String.valueOf(aa/bb);
        }
    }
    public int evalRPN(String[] tokens) {
        Stack<String> stack = new Stack<>();
        for(int i=0; i<tokens.length; i++){
            if(tokens[i].equals("+") || tokens[i].equals("-") || tokens[i].equals("*") || tokens[i].equals("/") ){
                String b = stack.pop();
                String a = stack.pop();
                String c = operation(a,b,tokens[i]);
                stack.add(c);
            } else{
                stack.add(tokens[i]);
            }
        }
        return Integer.parseInt(stack.pop());
    }
}