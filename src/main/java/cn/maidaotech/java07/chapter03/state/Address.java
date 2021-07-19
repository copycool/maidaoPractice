package cn.maidaotech.java07.chapter03.state;
//第三章练习题   第三题  “地址类”
public class Address {
    private String countries;   //国家
    private String province;    //省
    private String city;        //城市
    private String street;      //街道
    private int    postcode;    //邮编
    public String getCountries() {
        return countries;
    }
    public void setCountries(String countries) {
        this.countries = countries;
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
