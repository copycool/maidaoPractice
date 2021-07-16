package cn.maidaotech.java07.chaptet03;

public class AddressTest {
    public static void main(String[] args) {
        Address a1= new Address();
        a1.setCountry("中国");
        a1.setProvince("河南");
        a1.setCity("新郑");
        a1.setTownship("龙湖");
        a1.setZip("423567");
        System.out.println(a1.getCountry()+a1.getProvince()+a1.getCity()+a1.getTownship()+a1.getZip());

    }
    
}