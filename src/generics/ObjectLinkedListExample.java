package generics;

// Linked list of Object (using generics)
// Make a linked list, add an integer and a point to it.  Then
// get an iterator over the list, and get the integer and point out.
// Use casts (type coercion).

import java.awt.Point;
import java.util.Iterator;
import java.util.LinkedList;

class ObjectLinkedListExample {

    public static void main(String[] args) {
        LinkedList<Object> list = new LinkedList<>();
        list.add(new Integer(3));
        list.add(new Point(10, 20));
        Iterator<Object> itr = list.iterator();
        // living dangerously -- we happen to know that the first thing
        // in the list is an integer and the second is a point.
        Integer i = (Integer) itr.next();
        Point p = (Point) itr.next();
        System.out.println(i);
        System.out.println(p);
    }
}
