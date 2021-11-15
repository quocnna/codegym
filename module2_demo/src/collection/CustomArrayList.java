package collection;

import java.util.Arrays;

public class CustomArrayList<E> extends CustomAbstractList<E> {
    private final int DEFAULT_CAPACITY = 3;
    private E[] data = (E[]) new Object[DEFAULT_CAPACITY];

    public CustomArrayList() {
    }

    public CustomArrayList(int capacity) {
        if (capacity > 0)
            data = (E[]) new Object[capacity];
        else {
            throw new ArrayIndexOutOfBoundsException("Array list cannot less than 0");
        }
    }

    @Override
    public void add(int i, E e) {
        ensureCapacity();
//        for (int j = size-1; j >=i; j--) {
//            if(j==i){
//                data[j]= e;
//                break;
//            }
//            data[j]= data[j-1];
//        }

        for (int j = size; j > i; j--) {
            data[j] = data[j - 1];
        }
        data[i] = e;
        size++;
    }

    @Override
    public void remove(int i) {
        E[] tmp = (E[]) new Object[size - 1];
//        for (int j = 0,k=0; j < size; j++) {
//            if(j==i)
//                continue;
//            tmp[k++]=data[j];
//        }


        for (int j = 0, k = 0; j < size; j++) {
            if (j != i) {
                tmp[k] = data[j];
                k++;
            }
        }

        data = tmp;

//        for (int j = 0; j < size; j++) {
//            tmp[j]= data[j];
//        }
//        data= tmp;
        size--;
    }

    @Override
    public int indexOf(E e) {
        for (int i = 0; i < size; i++) {
            if (data[i] == e) return i;
        }
        return -1;
    }

    @Override
    public int lastIndexOf(E e) {
        int res=-1;
        for (int i = 0; i < size; i++) {
            if(data[i]==e)
                res=i;
        }
        return res;
    }

    @Override
    public void clear() {
        data = (E[]) new Object[DEFAULT_CAPACITY];
        size = 0;
    }

    @Override
    public void read() {
        for (int i = 0; i < size; i++) {
            System.out.println(data[i]);
        }
    }

    @Override
    public E get(int i) {
        return data[i];
    }

    @Override
    public void addFirst(E e) {
        ensureCapacity();
        for (int i = size; i >0 ; i--) {
            data[i]= data[i-1];
        }
        data[0]= e;
        size++;
    }

    @Override
    public void addLast(E e) {
        data[size] = e;
        size++;
    }

    private void ensureCapacity() {
        if (size >= data.length) {
            E[] newData = (E[]) (new Object[size + 10]);
            for (int i = 0; i < size; i++) newData[i]= data[i];
            data= newData;

//            System.arraycopy(data, 0, newData, 0, size);
//            data = newData;
        }
    }
}
