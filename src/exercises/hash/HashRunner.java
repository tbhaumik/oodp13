package exercises.hash;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class HashRunner {
    public static void main(String[] args) {
        Set<String> names = new HashSet<>();
        for (int i = 0; i < 30; i++) {
            names.add("string" + i);
        }
        Iterator iter = names.iterator();
        while (iter.hasNext()) {
            System.out.println(iter.next());
        }
    }
}
