package tutorial.ref.kotlin

import org.springframework.context.support.ClassPathXmlApplicationContext
import tutorial.ref.java.employee.Employee

fun main(){
    var context = ClassPathXmlApplicationContext("kotlin/config.xml");
    var employee = context.getBean("emp",Employee::class)
    System.out.println(employee)

}