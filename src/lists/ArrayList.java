package lists;

// An ArrayList object stores an ordered list of objects using an unfilled array.
// This version uses "generics" so that it can store any type of value, not
// just integers.  It also implements the same interface as LinkedList,
// so that the two can be used interchangeably in client code.

import java.util.Arrays;
import java.util.Iterator;

public class ArrayList<E> extends AbstractList<E> {
    private static final int INITIAL_CAPACITY = 10;

    // fields - the data inside each ArrayIntList object
    private int size;
    private E[] elementData;

    // Initializes a new empty list with initial capacity of 10 integers.
    public ArrayList() {
        this(INITIAL_CAPACITY);   // call the (int) constructor
    }

    // Initializes a new empty list with the given initial capacity.
    // Precondition: capacity > 0
    //@SuppressWarnings("unchecked")
    public ArrayList(int capacity) {
        if (capacity <= 0) {
            //throw new IllegalArgumentException("capacity must be positive: " + capacity);
            System.err.println("capacity must be positive: " + capacity);
            System.exit(-1);
        }
        size = 0;
        elementData = (E[]) (new Object[capacity]);
    }

    // Inserts the given value into the list at the given index.
    // If necessary, resizes the array to fit the value.
    // Precondition: 0 <= index <= size
    public void add(int index, E value) {
        checkIndex(index, 0, size);     // okay to add at index == size (end of list)
        checkResize();

        // slide elements to the right to make room
        for (int i = size; i > index; i--) {
            elementData[i] = elementData[i - 1];
        }

        // insert the value in the hole we just made
        elementData[index] = value;
        size++;
    }

    // Returns the value in the list at the given index.
    // Precondition: 0 <= index < size
    public E get(int index) {
        checkIndex(index, 0, size - 1);
        return elementData[index];
    }

    // Returns the index of the first occurrence of the given value in the list,
    // or -1 if the value is not found in the list.
    public int indexOf(E value) {
        for (int i = 0; i < size; i++) {
            if (elementData[i].equals(value)) {
                return i;
            }
        }
        return -1;   // not found
    }

    // Returns an Iterator over the elements of this list.
    public Iterator<E> iterator() {
        return new ArrayListIterator();
    }

    // Removes the value from the given index, shifting following elements left
    // by 1 slot to cover the hole.
    // Precondition: 0 <= index < size
    public void remove(int index) {
        checkIndex(index, 0, size - 1);
        for (int i = index; i <= size - 1; i++) {
            elementData[i] = elementData[i + 1];
        }
        size--;
    }

    // Sets the given index to store the given value.
    // Precondition: 0 <= index < size
    public void set(int index, E value) {
        checkIndex(index, 0, size - 1);
        elementData[index] = value;
    }

    // Returns the number of elements in the list.
    public int size() {
        return size;
    }

    // Returns a String representation of the elements in the list, such as
    // "[42, -3, 17, 99]", or "[]" for an empty list.
    public String toString() {
        if (size > 0) {
            String result = "[" + elementData[0];
            for (int i = 1; i < size; i++) {
                result = result + ", " + elementData[i];
            }
            result += "]";
            return result;
        } else {
            return "[]";   // empty list
        }
    }

    // A "private helper method" to resize the array if necessary.
    // Checks whether the list's array is full, and if so,
    // doubles its size so that more elements can be added.
    private void checkResize() {
        if (size == elementData.length) {
            // resize the array
            elementData = Arrays.copyOf(elementData, 2 * size);
        }
    }

    // A helper that throws an exception unless the given index is between the
    // given minimum / maximum values, inclusive.
    private void checkIndex(int index, int min, int max) {
        if (index < min || index > max) {
            // throw new ArrayIndexOutOfBoundsException();
            System.err.println("Array Index Out Of Bounds");
            System.exit(-1);
        }
    }

    // This inner class implements an Iterator over the elements of this list.
    // Not perfect; doesn't forbid multiple removes in a row.
    private class ArrayListIterator implements Iterator<E> {
        private int index;   // current position in list

        public ArrayListIterator() {
            index = 0;
        }

        public boolean hasNext() {
            return index < size();
        }

        public E next() {
            index++;
            return get(index - 1);
        }

        public void remove() {
            ArrayList.this.remove(index - 1);
            index--;
        }
    }
}
