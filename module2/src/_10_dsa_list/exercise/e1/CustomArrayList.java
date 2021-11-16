package _10_dsa_list.exercise.e1;

import java.util.Arrays;

public class CustomArrayList<E> implements Cloneable {
    private static final int DEFAULT_CAPACITY = 3;
    private E[] elements;
    private int size;

    CustomArrayList() {
        elements = (E[]) new Object[DEFAULT_CAPACITY];
    }

    CustomArrayList(int initCapacity) {
        elements = (E[]) new Object[initCapacity];
    }

    void add(int index, E element) {
        ensureCapacity();
        for (int i = size; i > index; i--) elements[i] = elements[i - 1];
        elements[index] = element;
        size++;
    }

    boolean add(E e) {
        ensureCapacity();
        elements[size] = e;
        size++;
        return true;
    }

    E remove(int index) {
        E[] tmp = (E[]) new Object[size - 1];
        E res= elements[index];
        for (int i = 0, j = 0; i < size; i++) {
            if (i != index) tmp[j++] = elements[i];
        }
        elements= tmp;
        size--;
        return res;

/*        // the way two
        for (int j = 0, k = 0; j < size; j++) {
            if (j == i)
                continue;
            tmp[k++] = data[j];
        }*/
    }

    int size() {
        return size;
    }

    E get(int index) {
        if (index < 0 || index > size)
            throw new IndexOutOfBoundsException();

        return elements[index];
    }

//    // the way 2
//    public Object clone() throws CloneNotSupportedException {
//        return super.clone();
//    }

    public Object clone(){
        Object o= Arrays.copyOf(elements, size);
        return o;
    }

    private void ensureCapacity() {
        if (size >= elements.length) elements = Arrays.copyOf(elements, elements.length * 3 / 2);
    }
}
