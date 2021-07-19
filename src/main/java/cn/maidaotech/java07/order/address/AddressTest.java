package cn.maidaotech.java07.order.address;

//编写一个代表地址的 Address 类，地址信息由国家，省份，城市，街道，邮编组成，并可以调 用方法返回完整的地址信息。
public class AddressTest {
    public static void main(String[] args) {
        Address information  = new  Address();
        information.setCountry("中国");
        information.setProvince ("河南");
        information.setCity ("郑州");
        information.setStreet ("龙湖");
        
        System.out.println(information.toString());
    }
}
