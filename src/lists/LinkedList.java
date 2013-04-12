package lists;

// A LinkedList object stores a list of values using a linked list as its underlying data structure.
// This version uses "generics" so that it can store any type of value, not
// just integers.  It also implements the same interface as ArrayList,
// so that the two can be used interchangeably in client code.

import java.util.Iterator;

public class LinkedList<E> extends AbstractList<E> {
    private ListNode front;   // refers to first node in list (null if empty)

    // Constructs a new empty list.
    public LinkedList() {
        front = null;  // null front means empty
    }

    // Inserts the given value into this list at the specified index.
    // Precondition: 0 <= index <= size
    // Throws a NullPointerException if index > size.
    public void add(int index, E value) {
        if (index == 0) {
            // insert at the front
            front = new ListNode(value, front);
        } else {
            // insert in middle/end; walk to node before the one to insert
            ListNode current = goTo(index - 1);
            ListNode newNode = new ListNode(value, current.next);
            current.next = newNode;

            // shorter version of the above code
            // current.next = new ListNode(value, current.next);
        }
    }

    // Returns the element at the specified index from the list.
    // Precondition: 0 <= index < size
    // Throws a NullPointerException if index >= size.
    public E get(int index) {
        ListNode current = goTo(index);
        return current.data;
    }

    // Returns the index of the first occurrence of the given value in the list,
    // or -1 if the value is not found in the list.
    public int indexOf(E value) {
        int index = 0;
        ListNode current = front;
        while (current != null) {
            if (current.data == value) {
                return index;
            }
            index++;
            current = current.next;
        }
        return -1;
    }

    // Returns an Iterator over the elements of this list.
    public Iterator<E> iterator() {
        return new LinkedListIterator();
    }

    // Removes the value at the specified index from this list.
    // Precondition: 0 <= index < size
    // Throws a NullPointerException if index > size.
    public void remove(int index) {
        if (index == 0) {
            // removing from the front
            front = front.next;
        } else {
            ListNode current = goTo(index - 1);
            current.next = current.next.next;   // deletes the node
        }
    }

    // Sets the element at the specified index in the list to have the given value.
    // Precondition: 0 <= index < size
    // produces (throws) a NullPointerException if index >= size.
    public void set(int index, E value) {
        ListNode current = goTo(index);
        current.data = value;
    }

    // Returns the number of elements in this list.
    public int size() {
        int count = 0;
        ListNode current = front;
        while (current != null) {
            current = current.next;
            count++;
        }
        return count;
    }

    // Returns a text representation of this list, such as "[42, -3, 17]"
    // or "[]" for an empty list.
    public String toString() {
        if (front == null) {
            return "[]";
        } else {
            String result = "[" + front.data;
            ListNode current = front.next;
            while (current != null) {
                result += ", " + current.data;
                current = current.next;
            }
            result += "]";
            return result;
        }
    }

    // Returns a reference to the node object representing the index'th element
    // in the list.  Used as a helper by many of the public methods.
    private ListNode goTo(int index) {
        ListNode current = front;
        for (int i = 0; i < index; i++) {
            current = current.next;
        }
        return current;
    }

    // ListNode is a class for storing a single node of a linked list.
    // A node stores a single value of data, along with a reference (link) to another
    // node, which will be thought of as the next node in the overall chain.
    // This class is going to be used to store part of a list of integer values.
    public class ListNode {
        public E data;
        public ListNode next;

        public ListNode(E data) {
            this.data = data;
            this.next = null;
        }

        public ListNode(E data, ListNode next) {
            this.data = data;
            this.next = next;
        }
    }

    // This inner class implements an Iterator over the elements of this list.
    // Not perfect; doesn't support remove.
    private class LinkedListIterator implements Iterator<E> {
        private ListNode current;   // current position in list

        public LinkedListIterator() {
            current = front;
        }

        public boolean hasNext() {
            return current != null;
        }

        public E next() {
            E result = current.data;
            current = current.next;
            return result;
        }

        // not implemented for now
        public void remove() {
            throw new UnsupportedOperationException();
        }
    }
}
