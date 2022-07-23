package com.designation

class Designation {
    var emp_id:Int? = null
    var salary:Int? = null
    var department:String? = null
    var email: String? = null


    constructor(emp_id: Int?, salary: Int?, department: String?, email: String?) {
        this.emp_id = emp_id
        this.salary = salary
        this.department = department
        this.email = email
    }

    constructor()

    override fun toString(): String {
        return "Designation(emp_id=$emp_id, salary=$salary, department=$department, email=$email)"
    }


}