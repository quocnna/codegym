package collection;

public interface CustomList<E> {
    void read();
    E get(int i);
    void addFirst(E e);
    void addLast(E e);
    void add(int i, E e);
    void remove(int i);

    int indexOf(E e);
    int lastIndexOf(E e);
    void clear();

    boolean isEmpty();
    int size();
}
