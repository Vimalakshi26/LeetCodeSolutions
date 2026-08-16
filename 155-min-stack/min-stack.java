class MinStack {
    private Stack<Integer> main;
    private Stack<Integer> minStack;

    public MinStack() {
        main = new Stack<>();
        minStack = new Stack<>();
    }
    
    public void push(int value) {
        main.push(value);
        if(minStack.empty() || value <= minStack.peek()){
            minStack.push(value);
        }
    }
    
    public void pop() {
        if(main.peek().equals(minStack.peek())){
            minStack.pop();
        }
        main.pop();
    }
    
    public int top() {
        return main.peek();
    }
    
    public int getMin() {
        return minStack.peek();
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