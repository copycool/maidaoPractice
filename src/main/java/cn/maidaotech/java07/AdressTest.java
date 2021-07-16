package cn.maidaotech.java07;



//编写一个代表地址的Address类，
//地址信息由国家，省份，城市，街道，邮编组成，并可以调用方法返回完整的地址信息。
public class AdressTest {
    private String county;
    private String province;
    private String city;
    private String street;
    private String postode;
    public static void main(String[] args) {
        AdressTest adress = new AdressTest();
        adress.setCounty("中国");
        adress.setProvince("河南省");
        adress.setCity("郑州");
        adress.setStreet("龙湖街道");
        adress.setPostode("450000");
        System.out.println("国家:"+adress.getCounty()+"  省份："+adress.getProvince()+"  城市："
        +adress.getCity()+"  街道:"+adress.getStreet()+"  邮编："+adress.getPostode());
    }

    public String getCounty() {
        return county;
    }

    public void setCounty(String county) {
        this.county = county;
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

    public String getPostode() {
        return postode;
    }

    public void setPostode(String postode) {
        this.postode = postode;
    }
    
    
}
