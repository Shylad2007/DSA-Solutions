class MinStack {
    protected Stack<Integer> min=new Stack<>();

    Stack<Integer> stack;

    public MinStack() {
        stack=new Stack<>();
        min.push(Integer.MAX_VALUE);
    }
    
    public void push(int value) {  
        stack.push(value);
        if(value<=min.peek())
            min.push(value);
    }
    
    public void pop() {
        int removed=stack.pop();

        if(min.peek()==removed)
            min.pop();
    }
    
    public int top() {
        return stack.peek();
    }
    
    public int getMin() {
        return min.peek();    
    }
}

/**
 * Your MinStack object will be instantiated and called as such:
 * MinStack obj = new MinStack();
 * obj.push(value);
 * obj.pop();
 * int param_3 = obj.top();
 * int param_4 = obj.getMin();
 */