package collection;

public abstract class CustomAbstractList<E> implements CustomList<E> {
    int size;

    @Override
    public int size() {
        return size;
    }

    @Override
    public boolean isEmpty() {
        return size>0;
    }
}
