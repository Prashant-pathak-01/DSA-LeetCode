class MyQueue {
    Stack<Integer> stack;
    public MyQueue() {
        stack = new Stack<>();
    }
    
    public void push(int x) {
        stack.push(x);
    }
    
    public int pop() {
        Stack<Integer> temp = new Stack<>();
        while(!stack.isEmpty()){
            temp.push(stack.pop());
        }
        int res = temp.peek();
        temp.pop();
        while(!temp.isEmpty()){
            stack.push(temp.pop());
        }
        return res;
    }
    
    public int peek() {
        Stack<Integer> temp = new Stack<>();
        while(!stack.isEmpty()){
            temp.push(stack.pop());
        }
        int res = temp.peek();
        while(!temp.isEmpty()){
            stack.push(temp.pop());
        }
        return res;
    }
    
    public boolean empty() {
        return stack.isEmpty();
    }
}

/**
 * Your MyQueue object will be instantiated and called as such:
 * MyQueue obj = new MyQueue();
 * obj.push(x);
 * int param_2 = obj.pop();
 * int param_3 = obj.peek();
 * boolean param_4 = obj.empty();
 */