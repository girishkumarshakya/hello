package com;

import com.address.Address;
import com.designation.Designation;
import com.person.Person;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TestClass {
    public static void main(String args[]){
        ApplicationContext context = new ClassPathXmlApplicationContext("config.xml");
        HelloMessage message = context.getBean("ms",HelloMessage.class);
        System.out.println("---------------------------");
        System.out.println(message);
        System.out.println("---------------------------");
        Person person = context.getBean("person",Person.class);
        Address address = context.getBean("address",Address.class);
        System.out.println(address);
        System.out.println("---------------------------");
        System.out.println(person);
        System.out.println("---------------------------");
        Designation designation = context.getBean("designation",Designation.class);
        System.out.println(designation);

    }
}
