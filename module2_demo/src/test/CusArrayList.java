package test;

import java.lang.Object;

public class CusArrayList<T> {
    private final int DEAULT_CAPACITY= 10;
    private T[] data= (T[])new Object[DEAULT_CAPACITY];
    private int size;

    public void add(T t){
        data[size]= t;
        size++;
    }
}
