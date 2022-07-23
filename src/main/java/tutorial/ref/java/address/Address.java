package tutorial.ref.java.address;

public class Address {
    private String city;
    private String country;
    private int zipcode;

    @Override
    public String toString() {
        return "Address{" +
                "city='" + city + '\'' +
                ", country='" + country + '\'' +
                ", zipcode=" + zipcode +
                '}';
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    public int getZipcode() {
        return zipcode;
    }

    public void setZipcode(int zipcode) {
        this.zipcode = zipcode;
    }

    public Address() {
    }

    public Address(String city, String country, int zipcode) {
        this.city = city;
        this.country = country;
        this.zipcode = zipcode;
    }
}
