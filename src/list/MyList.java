package list;
import java.util.Arrays;

public class MyList<E> {
    private int size;
    private final int DEFAULT_CAPACITY = 10;
    private Object[] elements;

    public MyList() {
        elements = new Object[DEFAULT_CAPACITY];
    }

    public void ensureCapacity() {
        if (size == elements.length) {
            int newsize = elements.length * 2;
            elements = Arrays.copyOf(elements, newsize);
        }
    }

    public void add (E e) {
        ensureCapacity();
        elements[size++] = e;
    }

    public E get(int index) {
        if (index < 0 || index >= size) {
            throw new IndexOutOfBoundsException("Index: " + index + ",size: " + index);
        }
        return (E) elements[index];
    }
}
