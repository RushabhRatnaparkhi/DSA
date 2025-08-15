class MinStack {
    Stack<Integer> minstack;
    public MinStack() {
        minstack=new Stack<>();
    }
    
    public void push(int val) {
        minstack.push(val);
    }
    
    public void pop() {
        minstack.pop();
    }
    
    public int top() {
        
        return minstack.peek();
    }
    
    public int getMin() {
        Stack<Integer> mystack=new Stack<>();
        mystack.addAll(minstack);
        int[] elements=new int[minstack.size()];
        for(int i=0;i<minstack.size();i++){
            elements[i]=mystack.pop();
        }
        Arrays.sort(elements);
        return elements[0];
    }
}
