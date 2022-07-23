package tutorial.ref.java.employee;

import tutorial.ref.java.address.Address;
import tutorial.ref.java.person.Person;

public class Employee {
    private Person person;
    private Address address;
    private String emp_id;
    private String salary;

    @Override
    public String toString() {
        return "Employee{" +
                "person=" + person +
                ", address=" + address +
                ", emp_id='" + emp_id + '\'' +
                ", salary='" + salary + '\'' +
                '}';
    }

    public Person getPerson() {
        return person;
    }

    public void setPerson(Person person) {
        this.person = person;
    }

    public Address getAddress() {
        return address;
    }

    public void setAddress(Address address) {
        this.address = address;
    }

    public String getEmp_id() {
        return emp_id;
    }

    public void setEmp_id(String emp_id) {
        this.emp_id = emp_id;
    }

    public String getSalary() {
        return salary;
    }

    public void setSalary(String salary) {
        this.salary = salary;
    }

    public Employee() {
    }

    public Employee(Person person, Address address, String emp_id, String salary) {
        this.person = person;
        this.address = address;
        this.emp_id = emp_id;
        this.salary = salary;
    }
}
