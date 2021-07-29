package cn.maidaotech.java07.chapter3.question3;

public class Address {
    private String state;
    private String province;
    private String city;
    private String street;
    private Integer postCode;

    public Address() {

    }

    public Address(String state, String province, String city, String street, Integer postcode) {
        this.state = state;
        this.province = province;
        this.city = city;
        this.street = street;
        this.postCode = postcode;
    }

    public void setState(String state) {
        this.state = state;
    }

    public String getState() {
        return state;
    }

    public void setProvince(String province) {
        this.province = province;
    }

    public String getProvince() {
        return province;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getCity() {
        return city;
    }

    public void setStreet(String street) {
        this.street = street;
    }

    public String getStreet() {
        return street;
    }

    public void setPostcode(Integer postcode) {
        this.postCode = postcode;
    }

    public int getPostcode() {
        return postCode;
    }

    public void print() {
        System.out.println("国家：" + state + " 省份：" + province + " 城市: " + city + " 街道: " + street + " 邮编: " + postCode);
    }

    public static <adress> void main(String[] args) {
        Address resident = new Address();
        Address resident1 = new Address("中国", "郑州", "新郑", "龙湖镇", 410220);
        resident.print();
        resident1.print();
    }
}