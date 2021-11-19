package _11_stack_queue.exercise.so5;

import java.util.Arrays;

public class MyStack {
    private Integer arr[];
    private int size;
    private int index = 0;

    public MyStack(Integer size) throws Exception{
        if(size<=0)
            throw new Exception("size have to greater than 0");
        arr= new Integer[size];
    }

    public void push(Integer val){
        arr[index]= val;
        index++;
    }

    public int pop() throws Exception{
        if(isEmpty())
            throw new Exception("Stack is null");

            int res= arr[--index];
            arr= Arrays.copyOf(arr, index);
            return res;
    }

    public boolean isEmpty(){
        return index==0;
    }

    public boolean isFull(){
        return size==index;
    }

    public void read(){
        Arrays.asList(arr).forEach(System.out::println);
    }

    public static void main(String[] arg) throws Exception {
        MyStack myStack= new MyStack(5);
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
