package cn.maidaotech.chapter03.exampletest;

import cn.maidaotech.chapter03.example.Address;

public class AddressTest {
    public static void main(String[] args) {
        Address address1 = new Address();
        address1.setCountry("漂亮国");
        address1.setProvince("加州");
        address1.setCity("洛杉矶");
        address1.setBlock("唐人街");
        address1.setPostNumber(123);
        Address address2 = new Address("中国","山东","菏泽曹县","牛*",666);
        System.out.println(address1.addressMessage());
        System.out.println(address2.addressMessage());
    }
}