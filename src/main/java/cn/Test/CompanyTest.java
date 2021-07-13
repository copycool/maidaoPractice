package cn.Test;
import cn.maidaotech.java07.chapter01.Company;
public class CompanyTest {
    public static void main(String[] args) {
        Company com = new Company("迈道");
        
        com.setId(1);
        com.setAddress("龙湖镇");
        System.out.println(com.name);
        System.out.println(com.getAddress());
        System.out.println(com.getId());
    }
    
}
