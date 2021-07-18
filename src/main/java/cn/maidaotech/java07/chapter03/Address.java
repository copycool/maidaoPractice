package cn.maidaotech.java07.chapter03;

public class Address {
    private String country;
    private String province;
    private String city;
    private String street;
    private String detail;
    private Integer code;

    public String allMessage() {
        return new StringBuilder().append(this.country).append("/").append(this.province).append("/").append(this.city)
                .append("\n").append(this.street).append(" ").append(this.detail).append(this.code).toString();
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

    public String getDetail() {
        return detail;
    }

    public void setDetail(String detail) {
        this.detail = detail;
    }

    public Integer getCode() {
        return code;
    }

    public void setCode(int code) {
        this.code = code;
    }
    
    
    



}
