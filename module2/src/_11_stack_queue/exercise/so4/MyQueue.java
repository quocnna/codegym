package _11_stack_queue.exercise.so4;

public class MyQueue {
    private int capacity;
    private int queueArr[];
    private int head = 0;
    private int tail = -1;
    private int currentSize = 0;

    public MyQueue(int capacity) {
        queueArr= new int[capacity];
        this.capacity = capacity;
    }

    public void enqueue(int val){
        if(isFull())
            throw  new IndexOutOfBoundsException();
        if(isEmpty()){
            head=tail=val;
        }
        else {
            tail=val;
        }
        queueArr[currentSize]= val;
        currentSize++;
    }

    public void dequeue(){
        if(!isEmpty()){
            int[] tmp= new int[currentSize-1];
            System.arraycopy(queueArr,1,tmp, 0, currentSize-1);
            queueArr= tmp;
            currentSize--;
            tail= queueArr[currentSize-1];
        }
    }

    public boolean isEmpty(){
        return currentSize==0;
    }

    public boolean isFull(){
        return currentSize==capacity;
    }

    public void read(){
        for (int i = 0; i < currentSize; i++) {
            System.out.println(queueArr[i]);
        }
    }

    public static void main(String[] args){
        MyQueue myQueue= new MyQueue(3);
        myQueue.enqueue(1);
        myQueue.enqueue(8);
        myQueue.enqueue(4);
        System.out.println(myQueue.head);
        System.out.println(myQueue.tail);
        myQueue.dequeue();
        myQueue.dequeue();
        myQueue.read();
        System.out.println(myQueue.currentSize);
        System.out.println(myQueue.isEmpty());
        System.out.println(myQueue.isFull());
    }
}
