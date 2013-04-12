package generics;

// Simple example of using Java generics.
//
// Make a linked list of integers, add a couple of integers to it,
// get an iterator over the list, and get the integers out.
// Note that the LinkedList uses a generic type, as does the iterator.

import java.util.Iterator;
import java.util.LinkedList;

class LinkedListExample {

    public static void main(String[] args) {
        LinkedList<Integer> myIntList = new LinkedList<>();
        myIntList.add(new Integer(3));
        myIntList.add(new Integer(4));
        Iterator<Integer> i = myIntList.iterator();
        Integer x = i.next();
        Integer y = i.next();
        System.out.println(x);
        System.out.println(y);
    }
}
