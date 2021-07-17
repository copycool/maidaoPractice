package cn.maidaotech.java07.chapter03;

public class Address {
    private String country;
    private String province;
    private String city;
    private String street;
    private String postCode;

    public Address() {
    }

    public Address(String country, String province, String city, String street, String postCode) {
        this.country = country;
        this.province = province;
        this.city = city;
        this.street = street;
        this.postCode = postCode;
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

    public String getPostCode() {
        return postCode;
    }

    public void setPostCode(String postCode) {
        this.postCode = postCode;
    }

    @Override
    public String toString() {
        return "Address [city=" + city + ", country=" + country + ", postCode=" + postCode + ", province=" + province
                + ", street=" + street + "]";
    }

}
