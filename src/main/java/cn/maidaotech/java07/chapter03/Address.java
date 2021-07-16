package cn.maidaotech.java07.chapter03;

public class Address {
    private String country;
    private String province;
    private String city;
    private String street;
    private int postcode;

    public Address(String country, String province, String city, String street, int postcode) {
        
        this.country = country;
        this.province = province;
        this.city = city;
        this.street = street;
        this.postcode = postcode;
    }

    @Override
    public String toString() {
        
        return "Address [city=" + city + ", country=" + country + ", postcode=" + postcode + ", province=" + province
                + ", street=" + street + "]";
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

    public int getPostcode() {
        return postcode;
    }

    public void setPostcode(int postcode) {
        this.postcode = postcode;
    }

    
    



}
