package wildcards;

import java.util.Arrays;
import java.util.Collection;
import java.util.EmptyStackException;

public class Stack <E>{
    private static final int DEFAULT_INITIAL_CAPACITY = 16;
    private int size;
    private E[] elements;

    public Stack() {
        size = 0;
        // TODO: 22/06/22 Why we can not create generic array in Java?
        elements = (E[]) new Object[DEFAULT_INITIAL_CAPACITY];
    }

    public void pushAll(Collection<? extends E> src) {
        for (E e : src) {
            push(e);
        }
    }

    public void popAll(Collection<? super E> dst) {
        while (!isEmpty()) {
            dst.add(pop());
        }
    }

    public void push(E e) {
        ensureCapacity();
        elements[size++] = e;
    }

    public E pop() {
        if (size == 0) {
            throw new EmptyStackException();
        }

        E result = elements[--size];
        elements[size] = null;
        return result;
    }

    public boolean isEmpty() {
        return size == 0;
    }

    public int size() {
        return size;
    }

    private void ensureCapacity() {
        if (elements.length == size) {
            elements = Arrays.copyOf(elements, 2 * size + 1);
        }
    }

}
