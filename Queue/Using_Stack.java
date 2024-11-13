import java.util.Stack;

class MyQueue {
    private Stack<Integer> stack1;
    private Stack<Integer> stack2;

    public MyQueue() {
        stack1 = new Stack<>();
        stack2 = new Stack<>();
    }

    // Enqueue operation: push element to stack1
    public void push(int x) {
        stack1.push(x);
    }

    // Dequeue operation: remove and return the front element
    public int pop() {
        // Transfer elements to stack2 if it's empty
        if (stack2.isEmpty()) {
            while (!stack1.isEmpty()) {
                stack2.push(stack1.pop());
            }
        }
        // Pop from stack2, which represents the front of the queue
        return stack2.pop();
    }

    // Peek operation: return the front element without removing it
    public int peek() {
        // Transfer elements to stack2 if it's empty
        if (stack2.isEmpty()) {
            while (!stack1.isEmpty()) {
                stack2.push(stack1.pop());
            }
        }
        // Peek the top of stack2, which represents the front of the queue
        return stack2.peek();
    }

    // Empty operation: check if the queue is empty
    public boolean empty() {
        return stack1.isEmpty() && stack2.isEmpty();
    }
}
