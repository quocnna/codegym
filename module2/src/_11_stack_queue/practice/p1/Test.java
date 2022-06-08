package _11_stack_queue.practice.p1;

public class Test {
    private static void stackOfIStrings() {
        MyStackByLinkedList<String> stack = new MyStackByLinkedList();
        stack.push("Five");
        stack.push("Four");
        stack.push("Three");
        stack.push("Two");
        stack.push("One");
        System.out.println("1.1 Size of stack after push operations: " + stack.size());
        System.out.printf("1.2. Pop elements from stack : ");

        while (!stack.isEmpty()) {
            System.out.printf(" %s", stack.pop());
        }

        System.out.println("\n1.3. Size of stack after pop operations : " + stack.size());
    }

    private static void stackOfIntegers() {
        MyStackByLinkedList<Integer> stack = new MyStackByLinkedList();
        stack.push(5);
        stack.push(4);
        stack.push(3);
        stack.push(2);
        stack.push(1);
        System.out.println("2.1. Size of stack after push operations: " + stack.size());
        System.out.printf("2.2. Pop elements from stack : ");

        while (!stack.isEmpty()) {
            System.out.printf(" %d", stack.pop());
        }

        System.out.println("\n3.3 Size of stack after pop operations : " + stack.size());
    }

    public static void main(String[] args) {
        System.out.println("1. Stack of integers");
        stackOfIntegers();

        System.out.println("\n2. Stack of Strings");
        stackOfIStrings();
    }
}
