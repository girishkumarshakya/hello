package tutorial.factory.method;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import tutorial.factory.method.impl.ClientServiceImpl;

public class TestClass {
    public static void main(String args[]){
        ApplicationContext context = new ClassPathXmlApplicationContext("factory/config.xml");
        ClientService clientService = context.getBean("clientService",ClientService.class);
        tutorial.factory.method.kotlin.ClientService
                cs = context.getBean("clientService1", tutorial.factory.method.kotlin.ClientService.class);
        ClientService csfm = context.getBean("cs", ClientServiceImpl.class);

    }
}
