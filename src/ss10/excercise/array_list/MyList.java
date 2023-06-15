package ss10.excercise.array_list;

import java.util.Arrays;

public class MyList<E> {
    private int size = 0;
    static final int DEFAULT_CAPACITY = 10;
    private Object[] elements;

    public MyList() {
        elements = new Object[DEFAULT_CAPACITY];
    }

    public void ensureCapa() {
        int newSize = elements.length * 2;
        elements = Arrays.copyOf(elements, newSize);
    }

    public void add(E e) {
        if (size == elements.length) {
            ensureCapa();
        }
        elements[size++] = e;
    }

    public void remove(int index) {

    }

    public void show() {
        for (int i = 0; i < size; i++) {
            System.out.println(elements[i]);
        }
    }

    public int size() {
        int count = 0;
        for (int i = 0; i < elements.length; i++) {
            if (elements[i] != null) {
                count++;
            }
        }
        return count;
    }

    public int indexOf(E e) {
        for (int i = 0; i < size; i++) {
            if (elements[i] == e) {
                return i;
            }
        }
        return -1;
    }

    public E get(int i) {
        if (i >= size && i < 0) {
            throw new IndexOutOfBoundsException("Index: " + i + ", Size: " + size);
        }
        return (E) elements[i];
    }
}
