package _11_stack_queue.practice.p1;

import java.util.EmptyStackException;
import java.util.LinkedList;

public class MyStackByLinkedList<T> {
    private LinkedList<T> stack;

    public MyStackByLinkedList() {
        stack = new LinkedList();
    }

    public void push(T element) {
        stack.addFirst(element);
    }

    public T pop() {
        if (isEmpty()) {
            throw new EmptyStackException();
        }

        return stack.removeFirst();
    }

    public int size() {
        return stack.size();
    }

    public boolean isEmpty() {
        return stack.size() == 0;
    }
}
