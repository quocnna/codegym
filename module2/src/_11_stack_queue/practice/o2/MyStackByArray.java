package _11_stack_queue.practice.o2;

import java.util.Arrays;

public class MyStackByArray {
    private Integer arr[];
    private int size;
    private int index = 0;

    public MyStackByArray(Integer size) throws Exception{
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
}
