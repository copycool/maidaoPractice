package cn.maidaotech.java07.chapter03.practice;

public class Address {
    private String country;
    private String province;
    private String city;
    private String street;
    private String postalCode;

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

    @Override
    public String toString() {
        return "Address [city=" + city + ", country=" + country + ", postalCode=" + postalCode + ", province="
                + province + ", street=" + street + "]";
    }
    
}