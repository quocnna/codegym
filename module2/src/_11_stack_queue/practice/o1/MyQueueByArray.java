package _11_stack_queue.practice.o1;

public class MyQueueByArray {
    private int capacity;
    private int queueArr[];
    private int head = 0;
    private int tail = -1;
    private int currentSize = 0;

    public MyQueueByArray(int capacity) {
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

    public int getHead() {
        return head;
    }

    public int getTail() {
        return tail;
    }

    public int getCurrentSize() {
        return currentSize;
    }
}
