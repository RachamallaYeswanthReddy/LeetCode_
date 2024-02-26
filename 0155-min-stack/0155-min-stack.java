import java.util.Stack;

class MinStack {
    int min = Integer.MAX_VALUE;
    Stack<Integer> st1;

    public MinStack() {
        st1 = new Stack<>();
    }
    
    public void push(int val) {
        if (val <= min) {
            st1.push(min);
            min = val;
        }
        st1.push(val);
    }
    
    public void pop() {
        if (st1.pop() == min) {
            min = st1.pop();
        }
    }
    
    public int top() {
        return st1.peek();
    }
    
    public int getMin() {
        return min;
    }
}
