package cn.maidaotech.java07.chapter03.state;
//第三章练习题   第三题  主程序入口
public class Application {
    public static void main(String[] args) {
        Address guo = new   Address();
        guo.setCountries("中国"+("asd"));
        guo.setProvince("河南省");
        guo.setCity("郑州");
        guo.setStreet("阳光大道");
        guo.setPostcode(123);

        System.out.println(guo.getCountries());
        System.out.println(guo.getProvince());
        System.out.println(guo.getCity());
        System.out.println(guo.getStreet());
        System.out.println(guo.getPostcode());
    }
}
