package cn.maidaotech.java07.Address;
public class Addresstext {
// 编写一个代表地址的 Address 类，地址信息由国家，省份，城市，街道，邮编组成，并可以调 
// 用方法返回完整的地址信息。
    public static void main(String[] args) {
    location l1=new location();
    l1.contry="中国";
    l1.province="河南";
    l1.city="郑州";
    l1.street="龙湖";
    l1.post="1234";
     System.out.println(l1);   
    }
}
class location{
    String contry;
    String province;
    String city;
    String street;
    String post;
    @Override
    public String toString() {
        return "location city：" + city + ", contry：" + contry + ", post：" + post + ", province：" + province
                + ", street：" + street + "]";
    }
    
}
