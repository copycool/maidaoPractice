package cn.maidaotech.java07.chapter03;

public class Address{
    private String countries;
    private String provinces;
    private String city;
    private String street;
    private Integer postcode;
    
    public  Address() {
        
    }
    

    public Address(String countries, String provinces, String city, String street, Integer postcode) {
        this.countries = countries;
        this.provinces = provinces;
        this.city = city;
        this.street = street;
        this.postcode = postcode;
    }



    @Override
    public String toString() {
        return "Address [city=" + city + ", countries=" + countries + ", postcode=" + postcode + ", provinces="
                + provinces + ", street=" + street + "]";
    }



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


    public Integer getPostcode() {
        return postcode;
    }


    public void setPostcode(Integer postcode) {
        this.postcode = postcode;
    }
  
    
}