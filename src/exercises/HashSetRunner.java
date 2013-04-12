package exercises;

import java.util.HashSet;

public class HashSetRunner {
    public static void main(String[] args) {
        HashSet<String> myHashSet = new HashSet<String>();
        myHashSet.add("aaa");
        myHashSet.add("bbb");
        myHashSet.add("ccc");
        myHashSet.add("ddd");
        myHashSet.add("eee");
        myHashSet.add("fff");
        myHashSet.add("ggg");
        myHashSet.add("hhh");
        myHashSet.add("iii");
        myHashSet.add("aaa");
        myHashSet.add("bbb");
        myHashSet.add("ccc");
        myHashSet.add("ddd");
        myHashSet.add("eee");
        myHashSet.add("fff");
        myHashSet.add("ggg");
        myHashSet.add("hhh");
        myHashSet.add("iii");
        for (String s : myHashSet) {
            System.out.println(s);
        }
    }
}
