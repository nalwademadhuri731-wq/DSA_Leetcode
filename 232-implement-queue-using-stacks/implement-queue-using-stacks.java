class MyQueue {
      int s;
     Stack<Integer> s1 ;
    public MyQueue() {
        s1 = new Stack<>();
        s=0;
    }
    
    public void push(int x) {
         if(s1.isEmpty()){
          s1.push(x);
          s++;
          return;
      }
      int n=s1.pop();
      push(x);
      s1.push(n);
    }
    
    public int pop() {
      
        s--;
        return  s1.pop();
    }
    
    public int peek() {
         if(s1.isEmpty())return -1;
        return s1.peek();
    }
    
    public boolean empty() {
       if(s1.isEmpty())return true;
       return false;
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