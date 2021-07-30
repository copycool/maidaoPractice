package cn.maidaotech.java07.unit3;
public class Address{
    private  String nation;
    private  String province;
    private String city;
    private String street;
    private String code;

    public Address() {
    }

    public Address(final String nation, final String province, final String city, final String street,
            final String code) {
        this.nation = nation;
        this.province = province;
        this.city = city;
        this.street = street;
        this.code = code;
    }

    public String getNation() {
        return nation;
    }

    public void setNation(final String nation) {
        this.nation = nation;
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

    public String getCode() {
        return code;
    }

    public void setCode(final String code) {
        this.code = code;
    }


}
