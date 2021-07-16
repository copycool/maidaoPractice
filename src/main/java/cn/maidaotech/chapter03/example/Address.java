package cn.maidaotech.chapter03.example;

public class Address {
    private String country;
    private String province;
    private String city;
    private String block;
    private Integer postNumber;

    public Address() {
    }

    public Address(String country, String province, String city, String block, Integer postNumber) {
        this.country = country;
        this.province = province;
        this.city = city;
        this.block = block;
        this.postNumber = postNumber;
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

    public String getBlock() {
        return block;
    }

    public void setBlock(String block) {
        this.block = block;
    }

    public Integer getPostNumber() {
        return postNumber;
    }

    public void setPostNumber(Integer postNumber) {
        this.postNumber = postNumber;
    }

    public String addressMessage() {
        return "国家是" + this.country + "，省份是" + this.province + "，城市是" + this.city + "，街道是" + this.block + "，邮编是"
                + this.postNumber;
    }

    @Override
    public String toString() {
        return "Address [block=" + block + ", city=" + city + ", country=" + country + ", postNumber=" + postNumber
                + ", province=" + province + "]";
    }

}