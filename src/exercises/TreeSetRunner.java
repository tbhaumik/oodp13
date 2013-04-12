package exercises;

import java.util.TreeSet;

public class TreeSetRunner {
    public static void main(String[] args) {
        TreeSet<String> myTreeSet = new TreeSet<String>();
        myTreeSet.add("iii");
        myTreeSet.add("hhh");
        myTreeSet.add("ggg");
        myTreeSet.add("fff");
        myTreeSet.add("eee");
        myTreeSet.add("ddd");
        myTreeSet.add("ccc");
        myTreeSet.add("bbb");
        myTreeSet.add("aaa");
        myTreeSet.add("iii");
        myTreeSet.add("hhh");
        myTreeSet.add("ggg");
        myTreeSet.add("fff");
        myTreeSet.add("eee");
        myTreeSet.add("ddd");
        myTreeSet.add("ccc");
        myTreeSet.add("bbb");
        myTreeSet.add("aaa");
        for (String s : myTreeSet) {
            System.out.println(s);
        }
    }
}