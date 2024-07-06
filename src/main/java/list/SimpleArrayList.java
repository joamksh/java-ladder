package list;

import java.util.Arrays;

public class SimpleArrayList implements SimpleList {
    private static final int INITIAL_CAPACITY = 10;
    private String[] elements;
    private int size;

    public SimpleArrayList() {
        elements = new String[INITIAL_CAPACITY];
        size = 0;
    }

    @Override
    public boolean add(String value) {
        ensureCapacity(size + 1);
        elements[size++] = value;
        return true;
    }

    @Override
    public void add(int index, String value) {
        checkIndex(index);
        ensureCapacity(size + 1);
        System.arraycopy(elements, index, elements, index + 1, size - index);
        elements[index] = value;
        size++;
    }

    @Override
    public String set(int index, String value) {
        checkIndex(index);
        String oldValue = elements[index];
        elements[index] = value;
        return oldValue;
    }

    @Override
    public String get(int index) {
        checkIndex(index);
        return elements[index];
    }

    @Override
    public boolean contains(String value) {
        return indexOf(value) >= 0;
    }

    @Override
    public int indexOf(String value) {
        for (int i = 0; i < size; i++) {
            if (elements[i].equals(value)) {
                return i;
            }
        }
        return -1;
    }

    @Override
    public int size() {
        return size;
    }

    @Override
    public boolean isEmpty() {
        return size == 0;
    }

    @Override
    public boolean remove(String value) {
        int index = indexOf(value);
        if (index >= 0) {
            remove(index);
            return true;
        }
        return false;
    }

    @Override
    public String remove(int index) {
        checkIndex(index);
        String oldValue = elements[index];
        int numMoved = size - index - 1;
        if (numMoved > 0) {
            System.arraycopy(elements, index + 1, elements, index, numMoved);
        }
        elements[--size] = null;
        return oldValue;
    }

    @Override
    public void clear() {
        Arrays.fill(elements, 0, size, null);
        size = 0;
    }

    private void ensureCapacity(int minCapacity) {
        if (minCapacity > elements.length) {
            int newCapacity = elements.length * 2;
            elements = Arrays.copyOf(elements, newCapacity);
        }
    }

    private void checkIndex(int index) {
        if (index < 0 || index >= size) {
            throw new IndexOutOfBoundsException("Index: " + index + ", Size: " + size);
        }
    }
}

