package helloworld;

public class HelloWorldWithCommandLine {
    public static void main(String[] args) {
        // If an argument is provided, use it,
        // otherwise, display “Hello World!”
        if (args.length > 0) {
            System.out.println(args[0]);
        } else {
            System.out.println("Hello World!");
        }
    }
}