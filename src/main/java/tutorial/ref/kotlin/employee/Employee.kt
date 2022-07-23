package tutorial.ref.kotlin.employee

import tutorial.ref.kotlin.address.Address
import tutorial.ref.kotlin.person.Person


class Employee {
    var emp_id:String? = null
    var salary:String? = null
    var person: Person? = null
    var address: Address?=null

    constructor()
    constructor(emp_id: String?, salary: String?, person: Person?, address: Address?) {
        this.emp_id = emp_id
        this.salary = salary
        this.person = person
        this.address = address
    }

    override fun toString(): String {
        return "Employee(emp_id=$emp_id, salary=$salary, person=$person, address=$address)"
    }
}