package tutorial.ref.kotlin.person

class Person {
    var name:String? = null
    var lastName:String? = null
    var age:Int? = null

    constructor()
    constructor(name: String?, lastName: String?, age: Int?) {
        this.name = name
        this.lastName = lastName
        this.age = age
    }

    override fun toString(): String {
        return "Person(name=$name, lastName=$lastName, age=$age)"
    }


}