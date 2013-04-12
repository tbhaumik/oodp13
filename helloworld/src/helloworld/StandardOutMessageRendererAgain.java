package helloworld;

public class StandardOutMessageRendererAgain implements MessageRenderer {
    // MessageProvider is Java Interface
    private MessageProvider messageProvider = null;

    @Override
    public void render() {
        if (messageProvider == null)
            throw new RuntimeException(
                    "You must set the property messageProvider of class:" +
                            StandardOutMessageRenderer.class.getName());
        System.out.println(messageProvider.getMessage());
    }

    // MessageProvider is Java Interface

    @Override
    public void setMessageProvider(MessageProvider provider) {
        this.messageProvider = provider;
    }

    // MessageProvider is Java Interface
    @Override
    public MessageProvider getMessageProvider() {
        return this.messageProvider;
    }
}
