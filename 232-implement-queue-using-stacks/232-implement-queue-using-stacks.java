class MyQueue {

    Stack<Integer> front;
    Stack<Integer> back;

    public MyQueue() {
        front = new Stack<>();
        back = new Stack<>();
    }

    public void push(int x) {
        back.push(x);
    }

    public int pop() {

        while (!back.isEmpty()) {
            front.push(back.pop());
        }
        int res = front.pop();
        while (!front.isEmpty()) {
            back.push(front.pop());
        }
        return res;
    }

    public int peek() {
        while (!back.isEmpty()) {
            front.push(back.pop());
        }
        int x = front.peek();
        while (!front.isEmpty()) {
            back.push(front.pop());
        }
        return x;
    }

    public boolean empty() {
        if (front.isEmpty() && back.isEmpty())
            return true;
        else
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