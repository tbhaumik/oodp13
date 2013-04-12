package helloworld;

public class HelloWorldDecoupledAgain {
    public static void main(String[] args) {
        MessageRenderer mr = new StandardOutMessageRendererAgain();
        MessageProvider mp = new HelloWorldMessageProviderAgain();
        mr.setMessageProvider(mp);
        mr.render();
    }
}
