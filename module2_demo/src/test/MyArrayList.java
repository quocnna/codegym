package test;

import java.lang.Object;
import java.util.Arrays;

public class MyArrayList<T> {
    private final int DEAULT_CAPACITY= 10;
    private T[] data= (T[])new Object[DEAULT_CAPACITY];
    private int size;

    public int getSize() {
        return size;
    }

    public MyArrayList(){}
    public MyArrayList(int capacity){
        data=  (T[])new Object[capacity];
    }

    public T get(int index){
        return data[index];
    }

    public void add(int index, T t){
        ensureCapacity();
        for (int i = size; i >index; i--) data[i]=data[i-1];
        data[index]= t;
        size++;
    }

    public void addFirst(T t){
        ensureCapacity();
        for (int i = size; i >0; i--) data[i]= data[i-1];
        data[0]= t;
        size++;
    }

    public void add(T t){
        data[size]= t;
        size++;
    }

    public void addLast(T t){
        data[size]=t;

//        ensureCapacity();
        data[0]= t;
//        Integer[] data1= new Integer[DEAULT_CAPACITY];
//        data1[0] = 56;
        size++;
    }

    public void read(){
        for (int i = 0; i < size; i++) {
            System.out.println(data[i]);
        }
    }

    public void remove(int index){
        T[] tmp = (T[])new Object[size-1];
        for (int i = 0, j=0; i < size; i++) {
            if(i!=index){
                tmp[j]=data[i];
                j++;
            }
        }
        data= tmp;
        size--;
    }

    public void ensureCapacity(){
        if(data.length==size){
            T[] tmp=  (T[])new Object[size+10];
            for (int i = 0; i < size; i++) tmp[i]= data[i];
            data= tmp;
        }
    }

    public T[] clone(){
        T[] res= (T[])new Object[size];

        for (int i = 0; i < size; i++) {
            res[i]= data[i];
        }

        return res;
    }
}
