package cn.maidaotech.java07.chapter03.practice;

public class Address {
    private String country;
    private String province;
    private String city;
    private String street;
    private String postalCode;

    public Address(String country, String province, String city, String street, String postalCode) {
        this.country = country;
        this.province = province;
        this.city = city;
        this.street = street;
        this.postalCode = postalCode;
    }

    @Override
    public String toString() {
        return new StringBuilder().append(this.country).append("/").append(this.province).append("/").append(this.city)
                .append("\n").append(this.street).toString();

    }

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    public String getProvince() {
        return province;
    }

    public void setProvince(String province) {
        this.province = province;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getStreet() {
        return street;
    }

    public void setStreet(String street) {
        this.street = street;
    }

    public String getPostalCode() {
        return postalCode;
    }

    public void setPostalCode(String postalCode) {
        this.postalCode = postalCode;
    }

}