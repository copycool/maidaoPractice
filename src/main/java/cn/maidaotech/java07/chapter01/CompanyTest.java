package cn.maidaotech.java07.chapter01;

public class CompanyTest {
    public static void main(String[] args) {
        Company com = new Company("迈道");
        com.id = 1;
        com.setAddress("龙湖镇");
        System.out.println(com.name);
        System.out.println(com.getClass());
        System.out.println(com.id);
    }
}
