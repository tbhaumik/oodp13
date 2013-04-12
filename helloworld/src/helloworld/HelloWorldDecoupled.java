package helloworld;

public class HelloWorldDecoupled {
    public static void main(String[] args) {
        // Create message renderer
        StandardOutMessageRenderer mr = new StandardOutMessageRenderer();

        // Create message provider
        HelloWorldMessageProvider mp = new HelloWorldMessageProvider();

        // Set the message provider to the message render
        mr.setMessageProvider(mp);

        // Call message renderer
        mr.render();
    }
}