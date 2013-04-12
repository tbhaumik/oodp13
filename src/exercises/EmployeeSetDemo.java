package exercises;

import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class EmployeeSetDemo {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        Set<Employee> employees = new HashSet<Employee>();

        boolean done = false;
        while (!done) {
            System.out.print("Employee id (-1 to cancel): ");
            long id = in.nextLong();
            in.nextLine(); // Ignore the end-of-line character
            if (id == -1) {
                done = true;
            } else {
                System.out.print("Name: ");
                String name = in.nextLine();
                System.out.print("Phone number: ");
                String phone = in.nextLine();
                System.out.print("Job Title: ");
                String jobTitle = in.nextLine();
                Employee employee = new Employee(id, name, phone, jobTitle);
                employees.add(employee);
            }
        }
        for (Employee employee : employees) {
            System.out.println(employee);
        }
    }
}