package cn.maidaotech.java07.ch03;

public class Address {
    private String country;
    private String province;
    private String city;
    private String street;
    private String postcode;

    public Address(){
        
    }
    // public Address(String country,String province,String city,String street,String postcode){
    //     this.country = country;
    //     this.province = province;
    //     this.city = city;
    //     this.street = street;
    //     this.postcode = postcode;

    // }
    public static void main(final String[] args) {
        final Address p1=new Address();
        p1.setCountry("中国");
        p1.setProvince("河南省");
        p1.setCity("郑州市");
        p1.setStreet("祥和路");
        p1.setPostcode("67776");
        
        System.out.println(p1.toString());
    }

    
    public String getCountry() {
        return country;
        
    }

    public void setCountry(final String country) {
        this.country = country;
    }

    public String getProvince() {
        return province;
    }

    public void setProvince(final String province) {
        this.province = province;
    }

    public String getCity() {
        return city;
    }

    public void setCity(final String city) {
        this.city = city;
    }

    public String getStreet() {
        return street;
    }

    public void setStreet(final String street) {
        this.street = street;
    }

    public String getPostcode() {
        return postcode;
    }


    public void setPostcode(String postcode) {
        this.postcode = postcode;
    }
    @Override
    public String toString() {
        return "Address [city=" + city + ", country=" + country + ", postcode=" + postcode + ", province=" + province
                + ", street=" + street + "]";
    }

    
}
