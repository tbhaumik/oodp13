package helloworld;

import org.springframework.stereotype.Component;

@Component
public class HelloWorldMessageProviderComp implements MessageProvider {
    public String getMessage() {
        return "Hello World!";
    }
}