package lists;

// This class captures common code shared by both the ArrayList and LinkedList.
//
// An abstract class is a good way to provide a partially implemented class, or
// a partial implementation of an interface.  Notice that the header of this
// class claims to implement the List interface, but the file doesn't provide
// all of the methods.
//
// Java allows this file to compile because it knows that the abstract class
// must be extended to complete it.  If a subclass of AbstractList doesn't
// implement all the rest of the List interface's methods, that subclass will
// not compile.

public abstract class AbstractList<E> implements List<E> {
    // Adds the given value to the end of the list.
    @Override
    public void add(E value) {
        // just call the other add method (to remove redundancy)
        add(size(), value);
    }

    // Returns true if the given value is found in this list.
    @Override
    public boolean contains(E value) {
        return indexOf(value) >= 0;
    }

    // Returns true if the list does not contain any elements.
    @Override
    public boolean isEmpty() {
        return size() == 0;
    }
}
