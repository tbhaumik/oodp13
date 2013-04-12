package exercises;

public class Employee {
    private long id;
    private String name;
    private String phoneNumber;
    private String jobTitle;

    public Employee(long anID, String aName, String aPhoneNumber, String aJobTitle) {
        id = anID;
        name = aName;
        phoneNumber = aPhoneNumber;
        jobTitle = aJobTitle;
    }

    public String getName() {
        return name;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public String getJobTitle() {
        return jobTitle;
    }

    public boolean equals(Object otherObject) {
        Employee other = (Employee) otherObject;
        if (id == other.id && name.equals(other.getName())
                && phoneNumber.equals(other.phoneNumber)
                && jobTitle.equals(other.jobTitle)) {
            return true;
        }
        return false;
    }

    public int hashCode() {
        int h1 = (new Long(id)).hashCode();
        int h2 = name.hashCode();
        int h3 = phoneNumber.hashCode();
        int h4 = jobTitle.hashCode();
        final int HASH_MULTIPLIER = 29;
        int h = HASH_MULTIPLIER * h1 + h2;
        h = HASH_MULTIPLIER * h + h3;
        h = HASH_MULTIPLIER * h + h4;
        return h;
    }

    public String toString() {
        return "Employee[id=" + id + ",name=" + name + ",phoneNumber=" + phoneNumber
                + ",jobTitle=" + jobTitle + "]";
    }
}