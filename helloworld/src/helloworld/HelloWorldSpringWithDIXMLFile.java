package helloworld;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class HelloWorldSpringWithDIXMLFile {
    public static void main(String[] args) throws Exception {
        // get the bean factory
        BeanFactory factory = getSpringBeanFactory();
        MessageRenderer mr = (MessageRenderer) factory.getBean("renderer");
        mr.render();
    }

    private static BeanFactory getSpringBeanFactory() throws Exception {
        // get the bean factory
        BeanFactory factory = new ClassPathXmlApplicationContext("/beans.xml");
        return factory;
    }
}