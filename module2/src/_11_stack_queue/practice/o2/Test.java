package _11_stack_queue.practice.o2;

public class Test {
    public static void main(String[] args) throws Exception {
        MyStackByArray myStack= new MyStackByArray(5);
        myStack.push(1);
        myStack.push(2);
        myStack.push(3);
        myStack.push(4);
        myStack.push(5);

        myStack.read();
        while (!myStack.isEmpty()) {
            System.out.printf("After: %d", myStack.pop());
        }
    }
}
