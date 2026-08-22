class MinStack {

    long min;
    Stack<Long> s;

    public MinStack() {
        s = new Stack<>();
    }

    public void push(int x) {

        if (s.isEmpty()) {
            s.push((long)x);
            min = x;
        }
        else if (x < min) {

            long encoded = 2L * x - min;

            s.push(encoded);
            min = x;
        }
        else {
            s.push((long)x);
        }
    }

    public void pop() {

        if (s.isEmpty())
            return;

        long top = s.peek();

        if (top < min) {
            min = 2L * min - top;
        }

        s.pop();
    }

    public int top() {

        if (s.isEmpty())
            return -1;

        long top = s.peek();

        if (top < min)
            return (int)min;

        return (int)top;
    }

    public int getMin() {

        if (s.isEmpty())
            return -1;

        return (int)min;
    }
}