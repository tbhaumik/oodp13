package exercises;

import java.util.Comparator;

public class PersonComparator implements Comparator<Person> {
    public int compare(Person person1, Person person2) {
        String pname1 = person1.getLastName() + person1.getFirstName();
        String pname2 = person2.getLastName() + person2.getFirstName();
        return pname1.compareTo(pname2);
    }
}

