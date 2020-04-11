class. Day10 {

}

class MinStack {
    Stack<Integer> mins  = new Stack<>();
    Stack<Integer> place  = new Stack<>();
    Stack<Integer> s  = new Stack<>();
    
    /** initialize your data structure here. */
    public MinStack() {
        
    }
    
    public void push(int x) {
        s.push(x);
        if (mins.isEmpty()) {
            mins.push(x);
            
        }  else{
            mins.push(mins.peek() > x ? x : mins.peek());    
        }
        
    }
    
    public void pop() {
        if (!mins.isEmpty()) {
            mins.pop();
        }
        if (!s.isEmpty()) {
            s.pop();
        }
    }
    
    public int top() {
        return s.peek();
    }
    
    public int getMin() {
        return mins.peek();
    }
}

/**
 * Your MinStack object will be instantiated and called as such:
 * MinStack obj = new MinStack();
 * obj.push(x);
 * obj.pop();
 * int param_3 = obj.top();
 * int param_4 = obj.getMin();
 */
