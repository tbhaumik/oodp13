package exercises;

import java.util.HashSet;
import java.util.Set;

public class Duplicates {
    public static void main(String[] args) {
        Set<Integer> men = new HashSet<>();
        for (int i = 1; i <= 5; i++) {
            men.add(i);
        }

        for (int i = 1; i <= 10; i++) {
            men.add(i);
        }
        System.out.println(men);
    }
}