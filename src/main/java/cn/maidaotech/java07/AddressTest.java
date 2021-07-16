package cn.maidaotech.java07;
//编写一个代表地址的 Address 类，地址信息由国家，省份，城市，街道，邮编组成，并可以调 用方法返回完整的地址信息。
public class AddressTest {
    public static void main(String[] args) {
        Address information  = new  Address();
        information.coutry ="中国";
        information.province ="河南";
        information.city = "郑州";
        information.street ="龙湖";
        information.postcode = 3454627;
        System.out.println(information.toString());
    }
}
class Address{
    String coutry;
    String province;
    String city;
    String street;
    int postcode;
    @Override
    public String toString() {
        return "Address [city=" + city + ", coutry=" + coutry + ", postcode=" + postcode + ", province=" + province
                + ", street=" + street + "]";
}             
    
}
