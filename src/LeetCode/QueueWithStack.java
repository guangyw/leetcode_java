package LeetCode;

import java.util.Deque;
import java.util.LinkedList;
import java.util.Stack;

/**
 * Created by guangyw on 7/7/15.
 */
class QueueWithStack {
    private Deque<Integer> first = new LinkedList<>();
    private Deque<Integer> second = new LinkedList<>();
    // Push element x to the back of queue.
    public void push(int x) {
        first.push(x);
    }

    // Removes the element from in front of queue.
    public void pop() {
        if (second.isEmpty()) {
            transfer();
        }
        second.pop();
    }

    // Get the front element.
    public int peek() {
        if (second.isEmpty()) {
            transfer();
        }
        return second.peek();
    }

    // Return whether the queue is empty.
    public boolean empty() {
        return first.isEmpty() && second.isEmpty();
    }

    public void transfer() {
        while (!first.isEmpty()) {
            second.push(first.pop());
        }
    }
}
