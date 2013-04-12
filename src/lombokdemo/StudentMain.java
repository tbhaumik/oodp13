package lombokdemo;

public class StudentMain {
    public static void main(String[] args) {
        Student s = new Student(1, "Fred", 0);
        System.out.println(s);
        s.setName("Betty");
        System.out.println(s);
        Student s1 = new Student(1, "Betty", 0);
        System.out.println(s1);
        if (s.equals(s1)) System.out.println("same student");
    }
}
