package exercises;

import java.util.LinkedList;
import java.util.List;
import java.util.ListIterator;

public class LinkedListRunner {
    public static void main(String[] args) {
        List<String> myList = new LinkedList<>();
        myList.add("aaa");
        myList.add("bbb");
        myList.add("ccc");
        myList.add("ddd");
        myList.add("eee");
        myList.add("fff");
        myList.add("ggg");
        myList.add("hhh");
        myList.add("iii");

        ListIterator<String> iterator = myList.listIterator();
        while (iterator.hasNext()) {
            System.out.println(iterator.next());
        }

        for (String s : myList)
            System.out.println(s);
        System.out.println("===");

        while (iterator.hasPrevious()) {
            String candidate = iterator.previous();
            switch (candidate.charAt(0)) {
                case 'a':
                case 'e':
                case 'i':
                case 'o':
                case 'u':
                    iterator.remove();
            }
        }

        while (iterator.hasNext())
            System.out.println(iterator.next());

        System.out.println("===");
    }
}