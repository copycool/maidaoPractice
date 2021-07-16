package cn.maidaotech.unit3.Test;
public class Address{
    private  String nation;
    private  String province;
    private String city;
    private String street;
    private String code;

    public Address() {
    }

    public Address(String nation, String province, String city, String street, String code) {
        this.nation = nation;
        this.province = province;
        this.city = city;
        this.street = street;
        this.code = code;
    }

    public String getNation() {
        return nation;
    }

    public void setNation(String nation) {
        this.nation = nation;
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

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }


}
