package exercises;

import java.util.TreeSet;

public class NewPersonRunner {
    public static void main(String[] args) {
        TreeSet<NewPerson> mySet = new TreeSet<>(); //new PersonComparator());
        mySet.add(new NewPerson("Sally", "Brown"));
        mySet.add(new NewPerson("Fred", "Kelly"));
        mySet.add(new NewPerson("Bill", "Akins"));
        mySet.add(new NewPerson("Julie", "Wilkins"));
        mySet.add(new NewPerson("James", "Langdon"));
        for (NewPerson p : mySet) {
            System.out.println(p);
        }
    }
}