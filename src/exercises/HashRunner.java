package exercises;

import java.util.HashSet;
import java.util.Set;

public class HashRunner {
    public static void main(String[] args) {
        Set<String> names1 = new HashSet<String>();
        for (int i = 0; i < 10; i++) {
            names1.add("stringa" + i);
        }
        System.out.println("names1:" + names1);
        Set<String> names2 = new HashSet<String>();
        for (int i = 0; i < 10; i++) {
            names2.add("stringb" + i);
        }
        System.out.println("names2:" + names2);
        names1.addAll(names2);
        System.out.println("names1:" + names1);
    }
}