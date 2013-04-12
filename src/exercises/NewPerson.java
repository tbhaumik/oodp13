package exercises;

public class NewPerson implements Comparable<NewPerson> {
    private String firstName;
    private String lastName;

    public NewPerson(String firstName, String lastName) {
        this.firstName = firstName;
        this.lastName = lastName;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public String toString() {
        return "Name: " + firstName + " " + lastName;
    }

    public int compareTo(NewPerson person) {
        String pname1 = lastName + firstName;
        String pname2 = person.lastName + person.firstName;
        return pname1.compareTo(pname2);
    }
}