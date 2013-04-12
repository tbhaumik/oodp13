package generics;

// Example of using a wildcard.
// Define a method that takes a linked list of ? as a parameter.

import java.awt.Point;
import java.util.Iterator;
import java.util.LinkedList;

class Wild2 {

    // note that we couldn't declare the parameter
    // as LinkedList<Object> !

    public static void printAll(LinkedList<?> s) {
        for (Object e : s) {
            System.out.println(e);
        }
    }

    // another version using an iterator
    public static void printAll2(LinkedList<?> s) {
        Iterator<?> it = s.iterator();
        while (it.hasNext()) {
            System.out.println(it.next());
        }
    }

    public static void main(String[] args) {
        LinkedList<Integer> ilist = new LinkedList<>();
        ilist.add(new Integer(3));
        ilist.add(new Integer(5));
        ilist.add(null);
        printAll(ilist);
        printAll2(ilist);

        LinkedList<Point> plist = new LinkedList<>();
        plist.add(new Point(10, 20));
        printAll(plist);
        printAll2(plist);
    }
}
