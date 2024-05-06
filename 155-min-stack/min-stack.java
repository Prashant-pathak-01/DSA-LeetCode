class Pair{
    int a;
    int b;
    Pair(int d1, int d2){
        a = d1;
        b = d2;
    }
}
class MinStack {
    Stack<Pair> stack;
    int min;
    public MinStack() {
        stack = new Stack<>();
        min = Integer.MAX_VALUE;
    }
    public void push(int val) {
        if(stack.isEmpty()) min = val;
        else if(val<stack.peek().b) min = val;
        else min = stack.peek().b;
        Pair pair = new Pair((int)val,min);
        stack.push(pair);
    }
    public void pop() {
        stack.pop();
    }
    public int top() {
        return stack.peek().a;
    }
    public int getMin() {
        return stack.peek().b;

    }
}
