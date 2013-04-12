package exercises.priority;

import java.util.PriorityQueue;

public class PriorityQueueRunner {
    public static void main(String[] args) {
        PriorityQueue<Person> pqueue = new PriorityQueue<>();
        pqueue.add(new Person("Sam", "Smith"));
        pqueue.add(new Person("Charlie", "Black"));
        pqueue.add(new Person("Betty", "Brown"));
        pqueue.add(new Person("Jessica", "Stewart"));
        pqueue.add(new Person("John", "Friday"));
        pqueue.add(new Person("Frank", "Foley"));
        while (!pqueue.isEmpty()) {
            System.out.println(pqueue.poll());
        }
    }
}