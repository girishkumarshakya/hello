package tutorial.ref.kotlin.address

class Address {
    var city:String? = null
    var country:String? = null
    var zipcode:Int? = null

    constructor()
    constructor(city: String?, country: String?, zipcode: Int?) {
        this.city = city
        this.country = country
        this.zipcode = zipcode
    }

    override fun toString(): String {
        return "Address(city=$city, country=$country, zipcode=$zipcode)"
    }
}