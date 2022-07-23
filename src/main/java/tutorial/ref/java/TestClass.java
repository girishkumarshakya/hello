package tutorial.ref.java;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import tutorial.ref.java.employee.Employee;

public class TestClass {

    public static void main(String args[]){
        ApplicationContext context = new ClassPathXmlApplicationContext("/java/config.xml");
        Employee emp = context.getBean("employee",Employee.class);
        System.out.println(emp);
    }
}
