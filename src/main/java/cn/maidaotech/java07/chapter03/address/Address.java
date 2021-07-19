package cn.maidaotech.java07.chapter03.address;

public class Address {
    //编写一个代表地址的Address类，地址信息由国家，省份，城市，街道，邮编组成，并可以调用方法返回完整的地址信息。
    private String nation;
    private String province;
    private String city;
    private String street;
    private String code;

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

    
    public void print(){
        System.out.println("地址信息为："+this.nation+this.province+this.city+this.street+" "+"邮政编号："+this.code);
    }
    
}