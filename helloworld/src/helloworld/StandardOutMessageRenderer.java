package helloworld;

public class StandardOutMessageRenderer {
    private HelloWorldMessageProvider messageProvider = null;

    public void setMessageProvider(HelloWorldMessageProvider provider) {
        this.messageProvider = provider;
    }

    public void render() {
        String message = messageProvider.getMessage();
        System.out.println(message);
    }
}
