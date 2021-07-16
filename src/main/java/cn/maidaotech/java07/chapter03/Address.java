package cn.maidaotech.java07.chapter03;

public class Address{
    private String countries;
    private String provinces;
    private String city;
    private String street;
    private String postcode;
    
    public  Address() {
        
    }
    
    // public Address(String countries, String provinces, String city, String street, String postcode) {
    //     this.countries = countries;
    //     this.provinces = provinces;
    //     this.city = city;
    //     this.street = street;
    //     this.postcode = postcode;
    // }

    public String getCountries() {
        return countries;
    }
    public void setCountries(String countries) {
        this.countries = countries;
    }
    public String getProvinces() {
        return provinces;
    }
    public void setProvinces(String provinces) {
        this.provinces = provinces;
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
    public String getPostcode() {
        return postcode;
    }
    public void setPostcode(String postcode) {
        this.postcode = postcode;
    }
    
}