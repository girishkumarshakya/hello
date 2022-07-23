package tutorial.nested;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TestClass {
    public static void main(String args[]){
        ApplicationContext context = new ClassPathXmlApplicationContext("nested/config.xml");
        Room room = context.getBean("room",Room.class);
        Room.Bathroom bathroom = context.getBean("bathRoom",Room.Bathroom.class);
        System.out.println("----------------------------------------------------------");
        System.out.println(room);
        System.out.println("----------------------------------------------------------");
        System.out.println(bathroom);
        System.out.println("----------------------------------------------------------");
        Room room1 = context.getBean("room1",Room.class);
        Room.Bathroom bathroom1 = context.getBean("bathRoom1",Room.Bathroom.class);
        System.out.println("----------------------------------------------------------");
        System.out.println(room1);
        System.out.println("----------------------------------------------------------");
        System.out.println(bathroom1);
    }
}
