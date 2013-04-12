package helloworld;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component("renderer") // This is the same as @Component(value="renderer")
public class StandardOutMessageRendererComp implements MessageRenderer {
    @Autowired
    private MessageProvider messageProvider = null;

    public void render() {
        // as before
    }

    @Override
    public void setMessageProvider(MessageProvider provider) {
        messageProvider = provider;
    }

    @Override
    public MessageProvider getMessageProvider() {
        return this.messageProvider;
    }
}
