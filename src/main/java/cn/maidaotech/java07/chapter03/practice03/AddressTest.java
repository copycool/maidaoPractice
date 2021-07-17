package cn.maidaotech.java07.chapter03.practice03;

public class AddressTest {
    public static void main(String[] args) {
        Address address = new Address();
        address.setCountry("中国");
        address.setProvince("河南省");
        address.setCity("郑州市");
        address.setStreet("龙湖镇环西路");
        address.setDetail("中原电商大厦B座313迈道科技");
        address.setCode(450000);

        System.out.println(address.allMessage());
    }
}