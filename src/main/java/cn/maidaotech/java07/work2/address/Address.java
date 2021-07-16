package cn.maidaotech.java07.work2.address;

public class Address {
    private String nation;
    private String province;
    private String city;
    private String street;
    private Integer postalCode;

    public Address() {
    }

    public Address(String nation, String province, String city, String street, Integer postalCode) {
        this.nation = nation;
        this.province = province;
        this.city = city;
        this.street = street;
        this.postalCode = postalCode;
    }

    @Override
    public String toString() {
        return "[" + this.nation + this.province + this.city + this.street + "  邮政编码：" + this.postalCode + "]";
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

    public Integer getPostalCode() {
        return postalCode;
    }

    public void setPostalCode(Integer postalCode) {
        this.postalCode = postalCode;
    }

}