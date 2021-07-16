package cn.maidaotech.java07.work3;

/*编写一个代表地址的 Address 类，
地址信息由国家，省份，城市，街道，邮编组成，
并可以调 用方法返回完整的地址信息。*/
public class Address {
    private String country;
    private String province;
    private String city;
    private String street;
    private String postcode;

    public Address() {
    }

    public Address(String country, String province, String city, String street, String postcode) {
        this.country = country;
        this.province = province;
        this.city = city;
        this.street = street;
        this.postcode = postcode;

    }

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    @Override
    public String toString() {
        return "Address [地址是：" + country + province + "省" + city + "市" + street + postcode + "]";
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

    public String getPostcode() {
        return postcode;
    }

    public void setPostcode(String postcode) {
        this.postcode = postcode;
    }

}
