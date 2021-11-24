package _11_stack_queue.practice.o1;

public class Test {
    public static void main(String[] args) {
        MyQueueByArray myQueue= new MyQueueByArray(3);
        myQueue.enqueue(1);
        myQueue.enqueue(8);
        myQueue.enqueue(4);
        System.out.println(myQueue.getHead());
        System.out.println(myQueue.getTail());
        myQueue.dequeue();
        myQueue.dequeue();
        myQueue.read();
        System.out.println(myQueue.getCurrentSize());
        System.out.println(myQueue.isEmpty());
        System.out.println(myQueue.isFull());
    }
}
