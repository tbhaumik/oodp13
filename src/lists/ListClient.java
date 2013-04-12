package lists;

// This client program uses and tests our two List classes.
// Notice that we can declare our variables using the interface type (List)
// and initialize them to store the actual object type such as Linked or Array List.
// Note that we must now supply an element type in < >.

public class ListClient {
    public static void main(String[] args) {
        List<Integer> list = new LinkedList<>();
        doStuff(list);
        List<Integer> list2 = new ArrayList<>();
        doStuff(list2);

        // now we can make lists of types other than integers!
        List<String> list3 = new ArrayList<>();
        list3.add("hi");
    }

    public static void doStuff(List<Integer> list) {
        // add elements to end of list
        list.add(10);
        list.add(20);
        list.add(30);
        list.add(40);
        list.add(50);

        // add elements at an index
        list.add(2, 999);
        list.add(3, -6);
        list.add(1, 7777);

        list.add(0, 88);
        list.add(5, 99999);
        list.remove(3);
        list.remove(4);
        list.remove(0);

        // We can do a for-each loop over a list because of Iterator and Iterable
        for (int n : list) {
            System.out.println(n);
        }
    }
}