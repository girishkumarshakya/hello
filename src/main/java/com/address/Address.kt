package com.address

class Address {
    var city: String? = null
    var country: String? = null
    var zipcode = 0
    override fun toString(): String {
        return "Address{" +
                "city='" + city + '\'' +
                ", country='" + country + '\'' +
                ", zipcode=" + zipcode +
                '}'
    }

    constructor() {}
    constructor(city: String?, country: String?, zipcode: Int) {
        this.city = city
        this.country = country
        this.zipcode = zipcode
    }
}